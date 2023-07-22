package jdbc;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
class Demo10 {

	private static final String excel_db = "select * from data.status";
	public static void main(String[] args) {
		String url = "jdbc:Excel:///C:\\Users\\mobin\\OneDrive\\Documents";
		try(Connection con = DriverManager.getConnection(url) ){
			try(PreparedStatement pstmt = con.prepareStatement(excel_db)){
				try(ResultSet rs = pstmt.executeQuery()){
					//rs.beforeFirst();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t" + rs.getString(2) + "\t" + rs.getString(3));
					}
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
