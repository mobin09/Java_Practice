package com.practice.persistence;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import jdbc.DBUtils;



public class StoreImagesToDb {
    
	public  static void soretoDb(){
		Connection con = null;
		PreparedStatement pstmt = null;
		FileInputStream fis = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String sname = sc.nextLine();
		System.out.println("Enter Your DOB(dd-MM-yyyy)");
		String dob = sc.nextLine();
		System.out.println("Enter the Address");
		String add = sc.nextLine();
		System.out.println("Enter the Location of your pic here:");
		String img = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		long time = 0l;
		try {
			java.util.Date udob = sdf.parse(dob);
			time = udob.getTime();
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		java.sql.Date sdob = new java.sql.Date(time);	
		try {
			File f = new File(img);
			fis = new FileInputStream(f);

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		if(con == null) {
			con = DBUtils.getConnection();
		}
		String query = "INSERT INTO students (sname, sdob, saddress, profilePic) values(?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, sname);
			pstmt.setDate(2, sdob);
			pstmt.setString(3, add);
			pstmt.setBinaryStream(4, fis);
			int i = pstmt.executeUpdate();
			System.out.println(i + " : Records Updated");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pstmt.close();
				sc.close();
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}catch(SQLException e) {
				 e.printStackTrace();
			} 
		}	
		
	}

	public static void getData() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {			
			String query = "SELECT id, sname, sdob, saddress, profilePic from students";			
			if(con == null) {
				con = DBUtils.getConnection();
			}
			
			stmt  = con.prepareStatement(query);
			rs = stmt.executeQuery();
			InputStream is = null;
			if(rs.next()) {
			Integer id = rs.getInt(1);
			String name = rs.getString(2);
			java.sql.Date d = rs.getDate(3);
			String address = rs.getString(4);
			is = rs.getBinaryStream(5);
			}
			FileOutputStream fos  = null;
			try {
				 fos = new FileOutputStream("E:\\javaCore\\iNueronCoreJava\\images\\abcd.jpg");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
			try {
				int i = is.read();
				while(i != -1) {
					fos.write(i);
					 i = is.read();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		//soretoDb();
		getData();
	}

}
