package collection.coreJava;

// Map<K, V>

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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

	}

}
