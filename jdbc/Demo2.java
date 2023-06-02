package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.SQLException;

class Demo2 {

	// insert data to students
	public static void insertToTable() {
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter student ID");
		int id = 0;
		try {
			id = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Only Valid Numbers are allowed please enter again");
			id = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Please Enter the Student Name");
		String name = sc.nextLine();
		System.out.println("Enter the Student Course name");
		String course = sc.nextLine();
		System.out.println("Enter the Student Address");
		String address = sc.nextLine();

		try {
			String query = "INSERT INTO STUDENTS (id, name, course, address) values(?,?,?,?)";
			con = DBUtils.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, course);
			pstmt.setString(4, address);
			int rowEffected = pstmt.executeUpdate();
			System.out.println("Record Inserted: " + rowEffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			sc.close();
			DBUtils.cleanUp(con, null, pstmt);
		}
	}

	public static void main(String[] args) {
		insertToTable();
	}

}
