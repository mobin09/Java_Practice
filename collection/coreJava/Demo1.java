package collection.coreJava;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
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
   }
}
