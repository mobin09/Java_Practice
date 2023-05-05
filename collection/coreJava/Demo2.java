package collection.coreJava;

import java.util.Collection;

// Map<K, V>

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Fan {
	private int wings;
	private int power;
	private int rating;
	private String manufacturer;

	public Fan(int wings, int power, int rating, String manufacturer) {
		super();
		this.wings = wings;
		this.power = power;
		this.rating = rating;
		this.manufacturer = manufacturer;
	}

	public int getWings() {
		return wings;
	}

	public int getPower() {
		return power;
	}

	public int getRating() {
		return rating;
	}

	public String getManufacturer() {
		return manufacturer;
	}

}

class Demo2 {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(10, "Sachin");
		hmap.put(7, "MSD");
		hmap.put(18, "Kohli");
		// System.out.println(hmap);

		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(30, "Mobin Arshad");
		lhm.put(50, "Washim Arshad");
		lhm.put(20, "Nadeem Arshad");
		lhm.put(10, "Jashim Arshad");

		// System.out.println(lhm);

		Fan f1 = new Fan(3, 50, 5, "Havels");
		Fan f2 = new Fan(3, 25, 5, "LG");
		Fan f3 = new Fan(4, 75, 4, "Samsung");

		HashMap<String, Fan> fanMap = new HashMap<>();
		fanMap.put("Havels", f1);
		fanMap.put("LG", f2);
		fanMap.put("Samsung", f3);

		System.out.println(fanMap);

		for (Map.Entry<String, Fan> fmap : fanMap.entrySet()) {
			System.out.println("Company Name::" + fmap.getKey());
			Fan f = fmap.getValue();
			System.out.println(
					"Fan info:\nWings:" + f.getWings() + ",Power in Watt:" + f.getPower() + ",Star:" + f.getRating());
		}
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Core Java");
		map.put(2, "Servlet/JSP");
		map.put(3, "Spring");
		map.put(4, "Spring Boot");
		map.put(5, "Web MVC");
		map.put(6, "Microservices");
		map.put(7, "MySQL");
		map.put(8, "JDBC");
		map.put(9, "Hibernate");
		
//		Collection<String> c = map.values();
//		Iterator itr= c.iterator();
//		while(itr.hasNext()) {
//			//System.out.println(itr.next());
//		}
		
		Set s = map.keySet();
		Iterator itr2 = s.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}
		
		System.out.println("=========================");
		
		Set s2 = map.entrySet();
		Iterator itr3 = s2.iterator();
		while(itr3.hasNext()) {		
			System.out.println(itr3.next());
			
		}

	}

}
