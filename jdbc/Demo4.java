package jdbc;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
class Demo4 {

	
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
		}finally {
			sc.close();
			try {
				con.close();
				pstmt.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	public static void main(String[] args) {
		insertCustomerData();
	}

}
