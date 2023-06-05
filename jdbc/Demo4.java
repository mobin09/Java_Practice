package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.sql.ResultSet;

class Demo4 {

	public static void getCustomerData() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String query = "SELECT id, name, dob FROM customerDetails";
			con = DBUtils.getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			System.out.println("\tID \tNAME \t\t\tDOB");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				java.sql.Date d = rs.getDate(3);
				System.out.println("\t" + id + "\t" + name + "\t" + d);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				pstmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void insertCustomerData() {
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Name");
		String name = sc.nextLine();
		System.out.println("Please enter your DOB(dd-MM-yy)");
		String dob = sc.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
		long milliseconds = 0l;
		try {
			java.util.Date udate = sdf.parse(dob);
			milliseconds = udate.getTime();
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		java.sql.Date sDate = new java.sql.Date(milliseconds);

		try {
			String query = "INSERT INTO customerDetails (name, dob) values(?, ?)";
			con = DBUtils.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setDate(2, sDate);
			int updateRow = pstmt.executeUpdate();
			System.out.println("Row Affected:" + updateRow);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			try {
				con.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		//insertCustomerData();
		getCustomerData();
	}

}
