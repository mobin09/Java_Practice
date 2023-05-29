package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

class JdbcConcept {

//	public static void getCon() {
//		Connection con;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseEngineers", "root", "mobink09");
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from Persons");
//			while (rs.next()) {
//				System.out.println("Person Id:" + rs.getInt(1) + " Person Name:" + rs.getString(2) + " Person Address:"
//						+ rs.getString(3) + " Person City:" + rs.getString(4));
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//	}

	public static void main(String[] args) {
		Connection con = DBUtils.getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PERSONS");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ":" + rs.getString(2));
			}

			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
