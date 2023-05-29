package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if (con == null) {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseEngineers", "root", "mobink09");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
		return con;
	}

}
