package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DBUtils {

	public static Connection getConnection() {
		Connection con = null;
		String url = null;
		String username = null;
		String pass = null;
		try {
			FileInputStream input = new FileInputStream("application.properties");
			Properties properties = new Properties();
			properties.load(input);
			url = properties.getProperty("url").trim();
			username = properties.getProperty("username").trim();
			pass = properties.getProperty("password").trim();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if (con == null) {
				con = DriverManager.getConnection(url, username, pass);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void cleanUp(Connection con, ResultSet rs, PreparedStatement ps) {

		try {
			if (con != null) {
				con.close();
			}

			if (rs != null) {
				rs.close();
			}

			if (ps != null) {
				ps.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void cleanUp(Connection con, ResultSet rs, Statement stmt) {
		try {
			if (con != null) {
				con.close();
			}

			if (rs != null) {
				rs.close();
			}

			if (stmt != null) {
				stmt.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("application.properties");
			Properties properties = new Properties();
			properties.load(input);
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String pass = properties.getProperty("password");

			System.out.println(url);
			System.out.println(username);
			System.out.println(pass);

		} catch (IOException e1) {

			e1.printStackTrace();
		}
	}

}
