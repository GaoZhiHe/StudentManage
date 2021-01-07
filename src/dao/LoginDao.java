package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import model.Admin;
import util.DbUtil;

public class LoginDao {
	public Admin login (String username, String password) {
		Admin user = null;
		Connection connection = (Connection) DbUtil.getConnection();
		try {
			Statement statement = (Statement) connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from Admin where Name = '"+username+"' and password = '"+password+"'");
			while(resultSet.next()) {
				String loginUser = resultSet.getString("Name");
				String loginPassword = resultSet.getString("password");
				user = new Admin();
				user.setUserName(loginUser);
				user.setPassword(loginPassword);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
