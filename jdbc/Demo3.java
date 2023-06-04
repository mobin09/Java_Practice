package jdbc;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

// Date object 

class Demo3 {

	public static void storeDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Date (dd-MM-yyyy)");
		String dt = sc.nextLine();
		// convert the date from String to java.util.Date
		SimpleDateFormat sdate = new SimpleDateFormat("dd-MM-yyyy");
		long milliDate = 0l;
		try {
			java.util.Date udate = sdate.parse(dt);
			milliDate = udate.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// convert java.util.Date to java.sql.Date
		java.sql.Date sqlDate = new java.sql.Date(milliDate);
		System.out.println(sqlDate);
		sc.close();

	}

	public static void main(String[] args) {
		// System.out.println("Date Object");
		// java.util.Date --> We use to store both date and time information

		java.util.Date utilDate = new java.util.Date();
		System.out.println("Util Date: " + utilDate);
		long val = utilDate.getTime();
		// System.out.println("Information about date in milliseconds: " + val);

		// utilDate.setTime(0);
		// System.out.println(utilDate);

		// java.sql.Date --> We use to store Date information
		java.sql.Date d = new java.sql.Date(val);
		// System.out.println("sqlDate:" + d);

		storeDate();

	}

}
