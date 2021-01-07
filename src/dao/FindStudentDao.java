package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import model.Admin;
import model.Student;
import util.DbUtil;

public class FindStudentDao {
	public static Student FindStudent(String sno) throws SQLException {
		Connection connection = (Connection) DbUtil.getConnection();
		Statement statement = (Statement) connection.createStatement();
		String sql = "select * from Student where sno = '"+sno+"'";
		//System.out.println(sql);
		ResultSet resultset =  statement.executeQuery(sql);
		while(resultset.next()) {
			String Sno = resultset.getString("sno");
			String name = resultset.getString("name");
			String age = resultset.getString("age");
			Student stu = new Student(sno,name,age);
			//System.out.println(name);
			return stu;
			
		}
		return null;
	}
	
	public static List<Student> FindAllStudent() throws SQLException {
		Connection connection = (Connection) DbUtil.getConnection();
		Statement statement = (Statement) connection.createStatement();
		String sql = "select * from Student";
		//System.out.println(sql);
		ResultSet resultset =  statement.executeQuery(sql);
		List<Student> list = new ArrayList<Student>();
		while(resultset.next()) {
			String Sno = resultset.getString("sno");
			String name = resultset.getString("name");
			String age = resultset.getString("age");
			Student stu = new Student(Sno,name,age);
			//System.out.println(name);
			list.add(stu);
		}
		return list;
	}
}
