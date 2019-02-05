package sm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sm.po.Admin;
import sm.util.DBUtil;

public class AdminDao {
	/**
	 * 根据用户名和密码查询
	 * @param name
	 * @param password
	 * @return
	 */
	public static Admin selectByUserAndPassword(String name,String password){
		Connection con = DBUtil.getConnection();
		//3.编写SQL语句
		String sql = 
		  "select adm_name,adm_password from tb_admin where adm_name=? and adm_password=?";
		PreparedStatement sta = null;
		//4.创建语句对象 
		try {
			sta = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//5.占位符赋值
		try {
			sta.setString(1, name);
			sta.setString(2, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet res = null;
		//6.执行语句
		try {
			res = sta.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//7.处理执行结果
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
		//8.释放资源
		DBUtil.closeAll(con, sta, res);
		return adm;
	}
}
