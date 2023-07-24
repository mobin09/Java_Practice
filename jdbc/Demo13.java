package jdbc;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
// HikariCP
class Demo13 {

	public static void main(String[] args) {
		
	  String config = "E:\\javaCore\\iNueronCoreJava\\src\\jdbc\\config.properties";	
      HikariConfig hikariConfig = new HikariConfig(config);	
      @SuppressWarnings("resource")
	  HikariDataSource dataSource = new HikariDataSource(hikariConfig);
      try {
    	String query = "select id, name, salary from employee";  
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t" + rs.getString(2) + "\t" + rs.getInt(3));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
      

	}

}
