package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

class Demo16 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
	
		try {
			con = DBUtils.getConnection();
			stmt = con.createStatement();
			String query = "SELECT ID, NAME, SALARY FROM EMPLOYEE LIMIT 4";
			rs = stmt.executeQuery(query);
			
			 RowSetFactory rsf =  RowSetProvider.newFactory();
			 CachedRowSet crs = rsf.createCachedRowSet(); // disconnected RowSet
			 crs.populate(rs);
			 
			con.close();
			
			System.out.println("ID\tNAME\tSALARY");			
			while(crs.next()) {
				System.out.println(crs.getInt(1) +"\t" + crs.getString(2) +"\t" + crs.getInt(3));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
