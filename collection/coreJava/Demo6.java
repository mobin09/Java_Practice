package collection.coreJava;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

class MyComparator5 implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
}

class MyComparator6 implements Comparator<StringBuffer> {
	@Override
	public int compare(StringBuffer s1, StringBuffer s2) {
		return s1.compareTo(s2);
	}
}

class MyComparator7 implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		int i1 = s1.length();
		int i2 = s2.length();
		if(i1 < i2 )
			return -1;
		else if(i1 > i2)
			return 1;
		else {
			return s1.compareTo(s2);
		}
		
	}
}

class MyComparator8 implements Comparator<AdharCard> {
	@Override
	public int compare(AdharCard s1, AdharCard s2) {
		String n1 = s1.getName();
		String n2 = s2.getName();
			return n1.compareTo(n2);
		}
		
	}



class AdharCard{
	private int Adharid;
	private String name;
	private String fname;
	private String dob;
	private String Address;
	public AdharCard(int adharid, String name, String fname, String dob, String address) {
		super();
		Adharid = adharid;
		this.name = name;
		this.fname = fname;
		this.dob = dob;
		Address = address;
	}
	public int getAdharid() {
		return Adharid;
	}
	public String getName() {
		return name;
	}
	public String getFname() {
		return fname;
	}
	public String getDob() {
		return dob;
	}
	public String getAddress() {
		return Address;
	}
	
}



class Demo6 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(new MyComparator5());
		ts.add("Mobin");
		ts.add("Washim");
		ts.add("Nadeem");
		ts.add("Jashim");
		ts.add("Fahad");

		System.out.println(ts);
		System.out.println("StringBuffer in TreeSet");
		TreeSet<StringBuffer> ts2 = new TreeSet<>(new MyComparator6());
		ts2.add(new StringBuffer("Mobin"));
		ts2.add(new StringBuffer("Washim"));
		ts2.add(new StringBuffer("Nadeem"));
		ts2.add(new StringBuffer("Jashim"));
		ts2.add(new StringBuffer("Fahad"));
		System.out.println(ts2);
		
		TreeSet<String> ts3 = new TreeSet<>(new MyComparator7());
		ts3.add("Mobin");
		ts3.add("Washim");
		ts3.add("Nadeem");
		ts3.add("Jashim");
		ts3.add("Fahad");
		ts3.add("Asdfgh");
		ts3.add("Abcdefghij");
		ts3.add("AB");
		ts3.add("M");
		System.out.println(ts3);
		
		AdharCard Mobin = new AdharCard(123, "Mobin Arshad", "Arshad Khan", "1-6-1998", "RN");
		AdharCard Mohit = new AdharCard(345, "Mohit Kumar", "Abc Kumar", "10-5-1999", "Delhi");
		AdharCard Ashok = new AdharCard(745, "Ashok", "Xyz Mourya", "10-5-1998", "GhaziaBad");
		ArrayList<AdharCard> al1 = new ArrayList<>();
		al1.add(Mobin);
		al1.add(Mohit);
		al1.add(Ashok);
		
		Collections.sort(al1, new MyComparator8());
		
		for(AdharCard ac: al1) {
			System.out.println("name:" + ac.getName() + " Adhar id:" + ac.getAdharid());
		}
		

	}

}
