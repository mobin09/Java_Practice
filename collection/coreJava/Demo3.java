package collection.coreJava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.WeakHashMap;

class Employee {
	private String name;
	private int emId;
	private String desigation;	
	Employee(){
	   this.name = "Mobin Arshad";
	   this.emId = 12345;
	   this.desigation = "Software Engineer";
	}	
	Employee(String name, int emId, String desigation){
		this.name = name;
		this.emId = emId;
		this.desigation = desigation;
	}
	public String getName() {
		return name;
	}
	public int getEmId() {
		return emId;
	}

	public String getDesigation() {
		return desigation;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", emId=" + emId + ", desigation=" + desigation + "]";
	}	
	@Override
	public void finalize() {
		System.out.println("Garbage Collector collected the garbage Objects");
	}	
}

class Demo3 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
        map.put("name", "Mobin Arshad");
        map.put("profession", "Software Engineer");
        map.put("age", "24");
        
        String str1 =  map.get("name");
        System.out.println(str1);
        System.out.println(map.containsKey("age"));
        System.out.println(map.containsValue("24"));
        
        Employee emp = new Employee();
        //System.out.println(emp1);
        
//        HashMap map2 = new HashMap();
//        map2.put("Mobin", emp); // HashMap dominate over the Garbage Collector
        
        WeakHashMap map3 = new WeakHashMap();// weak hash Map does not dominate the Garbage collector
        map3.put(emp, "Mobin");    
        emp = null;
        System.gc(); // Calling garbage collector explicitly
        
        Hashtable ht = new Hashtable();
        ht.put(1, "Mobin Arshad");
        ht.put(2, "Mohit Kumar Singh");
        //ht.put(3, null); // null key or value does not allowed to Hashtable
        //ht.put(null, "avbcd");
        System.out.println(ht);
        
        TreeMap tm = new TreeMap();
        tm.put(20, "Mobin");
        tm.put(75, "Sxyussy");
        tm.put(3, "Abcdfy");
        System.out.println(tm);
        
	}

}
