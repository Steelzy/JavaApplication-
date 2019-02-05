package sm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sm.po.Admin;
import sm.util.DBUtil;

public class AdminDao {
	/**
	 * �����û����������ѯ
	 * @param name
	 * @param password
	 * @return
	 */
	public static Admin selectByUserAndPassword(String name,String password){
		Connection con = DBUtil.getConnection();
		//3.��дSQL���
		String sql = 
		  "select adm_name,adm_password from tb_admin where adm_name=? and adm_password=?";
		PreparedStatement sta = null;
		//4.���������� 
		try {
			sta = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//5.ռλ����ֵ
		try {
			sta.setString(1, name);
			sta.setString(2, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet res = null;
		//6.ִ�����
		try {
			res = sta.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//7.����ִ�н��
		Admin adm = null;
		try {
			while(res.next()){
				adm = new Admin();
				adm.setName(res.getString("adm_name"));
				adm.setPassword(res.getString("adm_password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//8.�ͷ���Դ
		DBUtil.closeAll(con, sta, res);
		return adm;
	}
}
