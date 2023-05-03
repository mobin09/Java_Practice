package collection.coreJava;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class Pg{
	String pgName;
	String area;
	Pg(String pgName, String area){
		this.pgName = pgName;
		this.area = area;
	}
}

class Demo1 {
   public static void main(String[] args) {
	   Vector v = new Vector();
	   v.add(10);
	   v.add(20);
	   v.add(30);
	   
	   Enumeration e =  v.elements();
	   while(e.hasMoreElements()) {
		   Object o = e.nextElement();
		   System.out.println(o);
	   }
	   
	   ArrayList al = new ArrayList();
	   al.add(10);
	   al.add(20);
	   al.add(30);
	   
//	   for(int i=0; i<al.size(); i++) {
//		   System.out.println(al.get(i));
//		   al.add(123);
//	   }
	   
	   Iterator itr =  al.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
		   //al.add(143); // Fail-Fast (Concurrent Modificarion)
	   }
	   
	  CopyOnWriteArrayList coal = new CopyOnWriteArrayList(); 
	  coal.add(100);
	  coal.add(200);
	  coal.add(300);
	  coal.add(400);
	  
	  Iterator itrr = coal.iterator();
	  while(itrr.hasNext()) {
		  Object ob = itrr.next();
		  System.out.println(ob);
		  coal.add(999);
	  } 
	  // 100, 50, 150, 25, 75, 125, 175
	  TreeSet ts = new TreeSet();
	  ts.add(100);
	  ts.add(50);
	  ts.add(150);
	  ts.add(25);
	  ts.add(75);
	  ts.add(125);
	  ts.add(175);
	  System.out.println(ts);
	  ArrayList al1 = new ArrayList();
	  al1.add(100);
	  al1.add(50);
	  al1.add(150);
	  al1.add(25);
	  al1.add(75);
	  al1.add(125);
	  al1.add(175);
	  System.out.println(al1);
	  System.out.println(al1);
	  Collections.sort(al1);
	  System.out.println(al1);
	  
	  ArrayList<String> al2 = new ArrayList<>();
	  al2.add("Mobin Arshad");
	  al2.add("Rahmat Nagr");
	  System.out.println(al2);
	  
	  Pg pg1 = new Pg("RaipurPG", "Secor-126");  
	  Pg pg2 = new Pg("Virat Mansion", "Sector-125");
	  ArrayList<Pg> alPg =  new ArrayList<>();
	  alPg.add(pg1);
	  alPg.add(pg2);
	  System.out.println(alPg);
	  
	  Iterator<Pg> itr2 = alPg.iterator();
	  while(itr2.hasNext()) {
		  Pg p = (Pg)itr2.next();
		  System.out.println("Pg Name:" + p.pgName + " Pg Address: " + p.area);
	  }
	  
   }
}
