package collection.coreJava;

// Map<K, V>

import java.util.HashMap;
import java.util.LinkedHashMap;

class Demo2 {

	public static void main(String[] args) {
	    HashMap<Integer, String> hmap = new HashMap<>();	
	    hmap.put(10, "Sachin");
	    hmap.put(7, "MSD");
	    hmap.put(18, "Kohli");
	    System.out.println(hmap);
	    
	    LinkedHashMap lhm = new LinkedHashMap();
	    lhm.put(30, "Mobin Arshad");
	    lhm.put(50, "Washim Arshad");
	    lhm.put(20, "Nadeem Arshad");
	    lhm.put(10, "Jashim Arshad");
	    
	    System.out.println(lhm);
	    
    
	}

}
