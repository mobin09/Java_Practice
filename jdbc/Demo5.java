package jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;

 class Demo5 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {		
		 con = DBUtils.getConnection();
		 con.setAutoCommit(false);
		 stmt = con.createStatement();
		 String query1 = "INSERT INTO employee (name, salary) VALUES('Mobin', 49530)";
		 String query2 = "INSERT INTO employee (name, salary) VALUES('Mohit', 43530)";
		 stmt.addBatch(query1);
		 stmt.addBatch(query2);
		 int[] arr = stmt.executeBatch();
		for(int j: arr) {
			System.out.println(j);
		}
		 
		con.commit();
		con.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}	
  
	}

}
