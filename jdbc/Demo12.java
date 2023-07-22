package jdbc;

import javax.sql.DataSource;
import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
class Demo12 {

	public static void main(String[] args) {
		// Create an object of class that implements DataSource(I)
		MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();
		 dataSource.setUrl("jdbc:mysql://localhost:3306/bookstore");
		 dataSource.setUser("root");
		 dataSource.setPassword("mobink09");
		 
		 // getting the connection object from the Connection pool
		 try {
			 String qry = "select id, name, salary from employee";
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(qry);
			ResultSet rs  =pstmt.executeQuery();
			System.out.println("ID\tNAME\tSALARY");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) +"\t" + rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 

	}

}
