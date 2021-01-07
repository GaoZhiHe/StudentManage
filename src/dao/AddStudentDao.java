package dao;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;

import org.apache.commons.collections.functors.FalsePredicate;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ExceptionInterceptor;
import com.mysql.jdbc.PingTarget;
import com.mysql.jdbc.Statement;

import model.Admin;
import model.Student;
import util.DbUtil;

public class AddStudentDao{
	public static boolean AddStudent(String sno,String name,String age) throws SQLException {
		Connection connection = (Connection) DbUtil.getConnection();
		Statement statement = (Statement) connection.createStatement();
		String sql = "insert into Student(sno,name,age) values('"+sno+"','" + name +"','" + age + "')";
		//System.out.println(sql);
		int num =  statement.executeUpdate(sql);
		if(num > 0) {
			return true;
		}else {
			return false;
		}
		
	}
}


