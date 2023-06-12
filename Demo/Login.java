package Demo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.DBUtils;

public class Login {

	public static void main(String[] args) throws SQLException {
		Connection con = DBUtils.getConnection();
		ResultSet rs = null;
		Statement stmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String uname = sc.next();
		System.out.println("Enter password: ");
		String pwd = sc.next();
		String sql = "SELECT count(*) FROM users where username ='"+uname+ " 'AND  password ='"+pwd+"'";
		System.out.println(sql);
		stmt = con.createStatement();
		
		rs = stmt.executeQuery(sql);
		if(rs.next()) {
		   	int i = rs.getInt(1);
		   	if(i ==1) {
		   		System.out.println("Valid credentials");
		   	}else {
		   		System.out.println("Invalid Credentials");
		   	}
		}
		
	}

}
