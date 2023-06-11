package com.practice.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import jdbc.DBUtils;
import java.util.Scanner;

public class StoreCLOBdataToDB {

	public static ArrayList<String> getFromuser() {
		Scanner sc = null;
		ArrayList<String> al = null;
		try {
			al = new ArrayList<>();
			System.out.println("Enter name of User");
			sc = new Scanner(System.in);
			String name = sc.nextLine();
			System.out.println("Enter the DOB in (dd-MM-yy)");
			String dob = sc.nextLine();
			System.out.println("Enter the image Location");
			String img = sc.nextLine();
			System.out.println("Enter the resume location");
			String resume = sc.nextLine();
			al.add(name);
			al.add(dob);
			al.add(img);
			al.add(resume);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		return al;
	}

	public static java.sql.Date getTimeinSDate(String dob) {
		java.util.Date udate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		long time = 0l;
		try {
			udate = sdf.parse(dob);
			time = udate.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date sdate = new java.sql.Date(time);
		return sdate;
	}

	public static void insertdata() {
		Connection con = null;
		PreparedStatement pstmt = null;
		FileInputStream fis = null;
		FileInputStream resumeIs = null;

		// ArrayList<String> details = getFromuser();
		String name = null; // details.get(0);
		String dob = null; // details.get(1);
		String pic = null; // details.get(2);
		String resume = null;// details.get(3);
		String add = null;
		name = "Mobin Arshad";
		dob = "01-06-1998";
		add = "RN";
		pic = "C:\\Users\\mobin\\OneDrive\\Desktop\\mobin1.jpg";
		resume = "‪E:\\mobin.jpg";
		java.sql.Date sdate = getTimeinSDate(dob);

		try {

			File f2 = new File(pic);
			resumeIs = new FileInputStream(f2);
			File f1 = new File(pic);
			fis = new FileInputStream(f1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		if (con == null) {
			con = DBUtils.getConnection();
		}

		String query = "INSERT INTO students (sname, sdob, saddress, profilePic, resume) values(?,?,?,?,?)";

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setDate(2, sdate);
			pstmt.setString(3, add);
			pstmt.setBinaryStream(4, fis);
			pstmt.setBinaryStream(5, resumeIs);

			int i = pstmt.executeUpdate();
			System.out.println("Records Updated:" + i);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		insertdata();
	}

}
