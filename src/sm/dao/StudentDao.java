package sm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sm.po.Student;
import sm.util.DBUtil;

public class StudentDao {
	/**
	 * �����û����������ѯ
	 * @param name
	 * @param password
	 * @return
	 */
	public static Student selectByUserAndPassword(String name,String password){
		Connection con = DBUtil.getConnection();
		//3.��дSQL���
		String sql = 
		  "select stu_no,stu_name,stu_password,stu_class,stu_major,stu_chinese,stu_math,stu_english from tb_student where stu_name=? and stu_password=?";
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
		Student stu = null;
		try {
			while(res.next()){
				stu = new Student();
				stu.setNo(res.getString("stu_no"));
				stu.setName(res.getString("stu_name"));
				stu.setPassword(res.getString("stu_password"));
				stu.setChinese(res.getInt("stu_chinese"));
				stu.setMath(res.getInt("stu_math"));
				stu.setEnglish(res.getInt("stu_english"));
				stu.setClazz(res.getString("stu_class"));
				stu.setMajor(res.getString("stu_major"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//8.�ͷ���Դ
		DBUtil.closeAll(con, sta, res);
		return stu;
	}
	/**
	 * ��ѯ����ѧ����Ϣ
	 * @return
	 */
	public static List<Student> selectAll(){
		List<Student> list=new ArrayList<Student>();
		Connection con=DBUtil.getConnection();
		String sql="select stu_no,stu_name,stu_password,stu_class,stu_major,stu_chinese,stu_math,stu_english from tb_student";
		PreparedStatement sta = null;
		//4.���������� 
		try {
			sta = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//5.ռλ����ֵ
		
		ResultSet res = null;
		//6.ִ�����
		try {
			res = sta.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//7.����ִ�н��
		Student stu = null;
		try {
			while(res.next()){
				stu = new Student();
				stu.setNo(res.getString("stu_no"));
				stu.setName(res.getString("stu_name"));
				stu.setPassword(res.getString("stu_password"));
				stu.setChinese(res.getInt("stu_chinese"));
				stu.setMath(res.getInt("stu_math"));
				stu.setEnglish(res.getInt("stu_english"));
				stu.setClazz(res.getString("stu_class"));
				stu.setMajor(res.getString("stu_major"));
				list.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//8.�ͷ���Դ
		DBUtil.closeAll(con, sta, res);
		return list;
	}
	/**
	 * ����ѧ�Ų�ѯѧ����Ϣ
	 * @param no
	 * @return
	 */
	public static Student selectByNo(String no){
		Connection con = DBUtil.getConnection();
		//3.��дSQL���
		String sql = 
		  "select stu_no,stu_name,stu_password,stu_class,stu_major,stu_chinese,stu_math,stu_english from tb_student where stu_no=?";
		PreparedStatement sta = null;
		//4.���������� 
		try {
			sta = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//5.ռλ����ֵ
		try {
			sta.setString(1, no);
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
		Student stu = null;
		try {
			while(res.next()){
				stu = new Student();
				stu.setNo(res.getString("stu_no"));
				stu.setName(res.getString("stu_name"));
				stu.setPassword(res.getString("stu_password"));
				stu.setChinese(res.getInt("stu_chinese"));
				stu.setMath(res.getInt("stu_math"));
				stu.setEnglish(res.getInt("stu_english"));
				stu.setClazz(res.getString("stu_class"));
				stu.setMajor(res.getString("stu_major"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//8.�ͷ���Դ
		DBUtil.closeAll(con, sta, res);
		return stu;
	}
	
	/**
	 * ������������ѧ����Ϣ
	 * @param name
	 * @return
	 */
	public static Student selectByName(String name) {
		Connection con = DBUtil.getConnection();
		//3.��дSQL���
		String sql = 
		  "select stu_no,stu_name,stu_password,stu_class,stu_major,stu_chinese,stu_math,stu_english from tb_student where stu_name=?";
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
		Student stu = null;
		try {
			while(res.next()){
				stu = new Student();
				stu.setNo(res.getString("stu_no"));
				stu.setName(res.getString("stu_name"));
				stu.setPassword(res.getString("stu_password"));
				stu.setChinese(res.getInt("stu_chinese"));
				stu.setMath(res.getInt("stu_math"));
				stu.setEnglish(res.getInt("stu_english"));
				stu.setClazz(res.getString("stu_class"));
				stu.setMajor(res.getString("stu_major"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//8.�ͷ���Դ
		DBUtil.closeAll(con, sta, res);
		return stu;
	}
	/**
	 * ���ݰ༶��ѯ
	 * @param clazz
	 * @return
	 */
	public static List<Student> selectByClass(String clazz) {
		List<Student> list = new ArrayList<>();
		
		Connection con = DBUtil.getConnection();
		//3.��дSQL���
		String sql = 
		  "select stu_no,stu_name,stu_password,stu_class,stu_major,stu_chinese,stu_math,stu_english from tb_student where stu_class=?";
		PreparedStatement sta = null;
		//4.���������� 
		try {
			sta = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//5.ռλ����ֵ
		try {
			sta.setString(1, clazz);
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
		Student stu = null;
		try {
			while(res.next()){
				stu = new Student();
				stu.setNo(res.getString("stu_no"));
				stu.setName(res.getString("stu_name"));
				stu.setPassword(res.getString("stu_password"));
				stu.setChinese(res.getInt("stu_chinese"));
				stu.setMath(res.getInt("stu_math"));
				stu.setEnglish(res.getInt("stu_english"));
				stu.setClazz(res.getString("stu_class"));
				stu.setMajor(res.getString("stu_major"));
				list.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//8.�ͷ���Դ
		DBUtil.closeAll(con, sta, res);
		return list;
	}
	
	/**
	 * ����ѧ�Ÿ���(��������������ֶ�)
	 * @param stu
	 */
	
	public static void updateByNo(Student stu){
		Connection con = DBUtil.getConnection();
		//3.��дSQL���
		String sql = 
		  "update tb_student set stu_name=?,stu_class=?,stu_major=?,stu_chinese=?,stu_math=?,stu_english=? where stu_no=?";
		PreparedStatement sta = null;
		//4.���������� 
		try {
			sta = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//5.ռλ����ֵ
		try {
			sta.setString(1, stu.getName());
			sta.setString(2, stu.getClazz());
			sta.setString(3, stu.getMajor());
			sta.setInt(4, stu.getChinese());
			sta.setInt(5, stu.getMath());
			sta.setInt(6, stu.getEnglish());
			sta.setString(7, stu.getNo());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//6.ִ�����
		try {
			sta.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//7.�ͷ���Դ
		DBUtil.closeAll(con, sta, null);
	}
	
	/**
	 * ����������������
	 * @param stu
	 */
	
	public static void updatepassword(Student stu,String password){
		Connection con = DBUtil.getConnection();
		//3.��дSQL���
		String sql = 
		  "update tb_student set stu_password=? where stu_name=?";
		PreparedStatement sta = null;
		//4.���������� 
		try {
			sta = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//5.ռλ����ֵ
		try {
			sta.setString(1, password);
			sta.setString(2, stu.getName());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//6.ִ�����
		try {
			sta.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		//7.�ͷ���Դ
		DBUtil.closeAll(con, sta, null);
	}
	
	
	public static void saveStu(Student stu) {
		// TODO Auto-generated method stub
		Connection con = DBUtil.getConnection();
		//3.��дSQL���
		String sql = "insert into tb_student values(?,?,?,?,?,?,?,?)";
		PreparedStatement sta = null;
		//4.���������� 
		try {
			sta = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//5.ռλ����ֵ
		try {
			sta.setString(1, stu.getNo());
			sta.setString(2, stu.getName());
			sta.setString(3, stu.getPassword());
			sta.setString(4, stu.getClazz());
			sta.setString(5, stu.getMajor());
			sta.setInt(6, stu.getChinese());
			sta.setInt(7, stu.getMath());
			sta.setInt(8, stu.getEnglish());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//6.ִ�����
		try {
			sta.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//7.�ͷ���Դ
		DBUtil.closeAll(con, sta, null);
	}
}

	
