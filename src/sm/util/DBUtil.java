package sm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {//jdbc:sqlserver://localhost:1433;DatabaseName=sm
	private static final String URL = "jdbc:mysql://localhost:3306/sm?serverTimezone=UTC && useSSL=false";
	private static final String USER = "root";
	private static final String PASSWORD = "zhangyang888";
	//ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'youpassword';
	static {
		//1.注册驱动
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	/**
	 * 获取连接
	 * @return
	 */
	public static Connection getConnection(){
		Connection con = null;
		//2.获取连接
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	/**
	 * 释放资源
	 * @param con
	 * @param sta
	 * @param res
	 */
	public static void closeAll(Connection con,Statement sta,ResultSet res){
		//8.释放资源
		try {
			if(null!=res){
				res.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(null!=sta){
				sta.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(null!=con){
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
		
}
