package jdbc;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Demo11 {

	public static void main(String[] args) {
		String insertoExcelQuery = "INSERT INTO data.status VALUES(?,?,?)";
		String dburl = "jdbc:Excel:///C:\\Users\\mobin\\OneDrive\\Documents";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(dburl);
			pstmt = con.prepareStatement(insertoExcelQuery);
			pstmt.setInt(1, 6);
			pstmt.setString(2, "Mohit Kumar");
			pstmt.setString(3, "Full Stack Engineer");
			
			int x= pstmt.executeUpdate();
			System.out.println(x);
			if(x == 0) {
				System.out.println("Not Inserted");
			}else {
				System.out.println("Inserted Successfully");
			}
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
