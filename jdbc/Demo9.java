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
			
			//System.out.println("Records after the updation");
			
//			rs.beforeFirst();// take the cursor to the BFR
//			while(rs.next()) {
//				rs.refreshRow();
//				System.out.println(rs.getInt(1)+"\t "+rs.getString(2)+"\t "+rs.getInt(3));
//			}
				
			//Performing deletion operation using ResultSet 
			//System.out.println("Enter any key to delete last records");
			//rs.last(); // cursor is at last row
			//rs.deleteRow();
			
			// performing insert operation
			
//			rs.moveToInsertRow(); // create an empty record
//			// id is auto incremented
//			rs.updateString(2, "Mobin Arshad Khan");// set the value based on column index
//			rs.updateInt(3, 2556789); // salary
//			rs.insertRow(); // record will be inserted to table with updated values
//			rs.beforeFirst();// take the cursor to the BFR
//			while(rs.next()) {
//				rs.refreshRow();
//				System.out.println(rs.getInt(1)+"\t "+rs.getString(2)+"\t "+rs.getInt(3));
//			}
			
			
	   rs.beforeFirst();
	   while(rs.next()) {
		   int currentSalary = rs.getInt(3);
		   if(currentSalary < 50000) {
			   int incrementSalary = currentSalary + 5000;
			   rs.updateInt(3, incrementSalary);
			   rs.updateRow();
		   }
	   }
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
