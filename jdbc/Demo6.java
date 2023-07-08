package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

class Demo6 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtils.getConnection();
			con.setAutoCommit(false);
			String query = "INSERT INTO employee (name, salary) values(?,?)";
			pstmt = con.prepareStatement(query);

			while (true) {
				if (pstmt != null) {
					BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
					System.out.println("Enter the name of Employee");
					String name = br.readLine();
					System.out.println("Enter Salary");
					int sal = Integer.parseInt(br.readLine());
					pstmt.setString(1, name);
					pstmt.setInt(2, sal);
					pstmt.addBatch();

					System.out.println("Do you want to add new recorde [YES/NO]");
					String decision = br.readLine();
					if (decision.equalsIgnoreCase("NO")) {
						break;
					}

				}
			}

			int[] ar = pstmt.executeBatch();
			con.commit();
			System.out.println("Records updated Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
