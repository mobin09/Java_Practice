package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Demo9 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			con = DBUtils.getConnection();
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String qry = "select id, name, salary from employee limit 5";
			rs = stmt.executeQuery(qry);
			System.out.println("ID\t name\t salary");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t "+rs.getString(2)+"\t "+rs.getInt(3));
			}
			
			System.out.println();
			System.out.println("Application are in Pausing state please update the database");
			System.in.read();
			
			System.out.println("Records after the updation");
			
			rs.beforeFirst();// take the cursor to the BFR
			while(rs.next()) {
				rs.refreshRow();
				System.out.println(rs.getInt(1)+"\t "+rs.getString(2)+"\t "+rs.getInt(3));
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
