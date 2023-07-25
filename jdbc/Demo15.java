package jdbc;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

class Demo15 {

	public static void main(String[] args) {
	 try {
		RowSetFactory rsf = 	RowSetProvider.newFactory();
		JdbcRowSet jrs = rsf.createJdbcRowSet();// It is same as ResultSet but with Scrollable and Updatable
		// setting URl, userName and password
		jrs.setUrl("jdbc:mysql://localhost:3306/bookstore");
		jrs.setUsername("root");
		jrs.setPassword("mobink09");
		
		jrs.setCommand("select id, name, salary from employee limit 5");
		jrs.execute();
		
		System.out.println("Retrieving the records in forward direction");
		System.out.println("ID\tNAME\tSALARY");
		
		while(jrs.next()) {
			System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2)+"\t"+ jrs.getInt(3));
		}
		
		System.out.println();
		System.out.println("Retrieving the Records in backward direction..");
		
		while(jrs.previous()) {
			System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2)+"\t"+ jrs.getInt(3));
		}
		// Accessing the data randomly
		System.out.println();
		jrs.absolute(3);
		System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2)+"\t"+ jrs.getInt(3));
		System.out.println();
		jrs.relative(-2);
		System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2)+"\t"+ jrs.getInt(3));
				
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
