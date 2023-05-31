package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class Demo1 {

	public static int insertData() {
		Connection con = null;
		Statement stmt = null;
		int j = 0;
		try {
			String query = "INSERT INTO students (id, name,course, address) "
					+ "VALUE(105, 'Washim Arshad','Accounting','RahmatNagar')";
			con = DBUtils.getConnection();
			stmt = con.createStatement();
			int i = stmt.executeUpdate(query);
			System.out.println(1 + "Data inserted");
			j = 1;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return j;
	}

	public static void getData() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {

			con = DBUtils.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from students");
			while (rs.next()) {
				Integer id = rs.getInt(1);
				String name = rs.getString(2);
				String course = rs.getString(3);
				String address = rs.getString(4);
				System.out.println("Id:" + id + "\nName:" + name + "\nCourse:" + course + "\nAddress:" + address);
				System.out.println("****************");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void updateData() {
		Connection con = null;
		Statement stmt = null;
		String query = "UPDATE students set address = 'Gajipur up' where id = 104";
		try {
			con = DBUtils.getConnection();
			stmt = con.createStatement();
			int i = stmt.executeUpdate(query);
			System.out.println("Records updated:" + i);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void insertDataByKey() {
		Connection con = null;
		Statement stmt = null;
		System.out.println("Insert the user data to students table");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student ID");
		int id = 0;
		try {
			id = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Enter the Student ID in number only");
			id = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Enter the name of the Student");
		String sname = sc.nextLine();
		System.out.println("Enter the Registerd course of the Student");
		String course = sc.nextLine();
		System.out.println("Enter the Address of the Students");
		// System.out.println();
		String address = sc.nextLine();

//		// First Approach
//		String query = "INSERT INTO students(id, name, course, address) " + "value(" + id + ",'" + sname + "','"
//				+ course + "','" + address + "')";
//		 //String.format
		String query = String.format("INSERT INTO students(id, name, course, address) value(%d, '%s','%s', '%s')", id,
				sname, course, address);

		System.out.println(query);

		try {
			con = DBUtils.getConnection();
			stmt = con.createStatement();
			int i = stmt.executeUpdate(query);
			System.out.println(i + "Record added");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			sc.close();
		}

	}

	public static void main(String[] args) {
		// int r= insertData();
		// System.out.println(r);
		getData();
		// updateData();
		 //insertDataByKey();
	}

}
