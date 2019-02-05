package sm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sm.po.Student;
import sm.po.Teacher;
import sm.util.DBUtil;

public class TeacherDao {

	/**
	 * 根据用户名和密码查询
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	public static Teacher selectByUserAndPassword(String name, String password) {
		Connection con = DBUtil.getConnection();
		// 3.编写SQL语句
		String sql = "select tea_no,tea_name,tea_password,tea_course,tea_class from tb_teacher where tea_name=? and tea_password=?";
		PreparedStatement sta = null;
		// 4.创建语句对象
		try {
			sta = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 5.占位符赋值
		try {
			sta.setString(1, name);
			sta.setString(2, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet res = null;
		// 6.执行语句
		try {
			res = sta.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 7.处理执行结果
		Teacher tea = null;
		try {
			while (res.next()) {
				String tec_no = res.getString("tea_no");
				String tec_name = res.getString("tea_name");
				String tec_password = res.getString("tea_password");
				String tec_course = res.getString("tea_course");
				String tec_class = res.getString("tea_class");

				tea = new Teacher(tec_no, tec_name, tec_password, tec_course, tec_class);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 8.释放资源
		DBUtil.closeAll(con, sta, res);
		return tea;
	}

	/**
	 * 查询所有教师信息
	 * 
	 * @return
	 */
	public static List<Teacher> selectAll() {
		List<Teacher> list = new ArrayList<Teacher>();
		Connection con = DBUtil.getConnection();
		// 3.编写SQL语句
		String sql = "select tea_no,tea_name,tea_password,tea_course,tea_class from tb_teacher";
		PreparedStatement sta = null;
		// 4.创建语句对象
		try {
			sta = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet res = null;
		// 6.执行语句
		try {
			res = sta.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 7.处理执行结果
		Teacher tea = null;
		try {
			while (res.next()) {
				String tec_no = res.getString("tea_no");
				String tec_name = res.getString("tea_name");
				String tec_password = res.getString("tea_password");
				String tec_course = res.getString("tea_course");
				String tec_class = res.getString("tea_class");

				tea = new Teacher(tec_no, tec_name, tec_password, tec_course, tec_class);
				list.add(tea);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 8.释放资源
		DBUtil.closeAll(con, sta, res);
		return list;
	}

	public static void updateByNo(Teacher tea) {
		// TODO Auto-generated method stub
		Connection con = DBUtil.getConnection();
		// 3.编写SQL语句
		String sql = "update tb_teacher set tea_name=?,tea_password=?,tea_course=?,tea_class=? where tea_no=?";
		PreparedStatement sta = null;
		// 4.创建语句对象
		try {
			sta = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 5.占位符赋值
		try {
			String i = "1";
			sta.setString(1, tea.getTec_name());
			sta.setString(2, tea.getTec_password());
			sta.setString(3, tea.getTec_class());
			sta.setString(4, tea.getTec_course());
			sta.setString(5, tea.getTec_no());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 6.执行语句
		try {
			sta.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 7.释放资源
		DBUtil.closeAll(con, sta, null);
	}

	public static void saveTea(Teacher tea) {
		// TODO Auto-generated method stub
		Connection con = DBUtil.getConnection();
		// 3.编写SQL语句
		String sql = "insert into tb_teacher values(?,?,?,?,?)";
		PreparedStatement sta = null;
		// 4.创建语句对象
		try {
			sta = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 5.占位符赋值
		try {
			sta.setString(1, tea.getTec_no());
			sta.setString(2, tea.getTec_name());
			sta.setString(3, tea.getTec_password());
			sta.setString(4, tea.getTec_course());
			sta.setString(5, tea.getTec_class());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 6.执行语句
		try {
			sta.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 7.释放资源
		DBUtil.closeAll(con, sta, null);
	}

	public static List<Teacher> selectTeacher(String name) {
		// TODO Auto-generated method stub
		List<Teacher> list = new ArrayList<Teacher>();
		Connection con = DBUtil.getConnection();
		// 3.编写SQL语句
		String sql = "select tea_no,tea_name,tea_password,tea_course,tea_class from tb_teacher where tea_name="+"'"+name+"'";
		PreparedStatement sta = null;
		// 4.创建语句对象
		try {
			sta = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet res = null;
		// 6.执行语句
		try {
			res = sta.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 7.处理执行结果
		Teacher tea = null;
		try {
			while (res.next()) {
				String tec_no = res.getString("tea_no");
				String tec_name = res.getString("tea_name");
				String tec_password = res.getString("tea_password");
				String tec_course = res.getString("tea_course");
				String tec_class = res.getString("tea_class");

				tea = new Teacher(tec_no, tec_name, tec_password, tec_course, tec_class);
				list.add(tea);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 8.释放资源
		DBUtil.closeAll(con, sta, res);
		return list;
	}


public static void updateTeacher(Teacher tea) {
	// TODO Auto-generated method stub
	Connection con = DBUtil.getConnection();
	// 3.编写SQL语句
	String sql = "update tb_teacher set tea_name=?,tea_password=? where tea_no=?";
	PreparedStatement sta = null;
	// 4.创建语句对象
	try {
		sta = con.prepareStatement(sql);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	// 5.占位符赋值
	try {
		String i = "1";
		sta.setString(1, tea.getTec_name());
		sta.setString(2, tea.getTec_password());
		sta.setString(3, tea.getTec_no());
	} catch (SQLException e) {
		e.printStackTrace();
	}

	// 6.执行语句
	try {
		sta.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}

	// 7.释放资源
	DBUtil.closeAll(con, sta, null);
}
}