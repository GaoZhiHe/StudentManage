package util;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;


public class DbUtil {
	private static String dbUrl = "jdbc:mysql://127.0.0.1:3306/StuMange?useUnicode=true&characterEncoding=utf-8";
	private static String username = "root";
	private static String password = "1234";
	private static String driverName ="com.mysql.jdbc.Driver";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(driverName).newInstance();
			connection = DriverManager.getConnection(dbUrl, username, password);
			//System.out.println("*******数据库连接成功*********");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static void relase(Connection con, Statement state, ResultSet res) throws SQLException {
		if(con != null) {
			con.close();
		}
		if(state != null) {
			state.close();
		}
		if(res != null) {
			res.close();
		}
	}
}
