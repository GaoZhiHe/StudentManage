package dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import util.DbUtil;

public class DeleteStudentDao {
	public static boolean DeleteStudent(String sno) throws SQLException {
		Connection connection = (Connection) DbUtil.getConnection();
		Statement statement = (Statement) connection.createStatement();
		String sql = "delete from Student  where sno ='"+sno+"'";
		//System.out.println(sql);
		int num =  statement.executeUpdate(sql);
		if(num > 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
