package dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import util.DbUtil;

public class ChangeStudentDao {
	public static boolean ChangeStudent(String sno,String name,String age) throws SQLException {
		Connection connection = (Connection) DbUtil.getConnection();
		Statement statement = (Statement) connection.createStatement();
		String sql = "update Student set name='" + name +"',age='" + age + "' where sno ='"+sno+"'";
		//System.out.println(sql);
		int num =  statement.executeUpdate(sql);
		if(num > 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
