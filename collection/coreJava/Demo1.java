package collection.coreJava;

import java.util.Enumeration;
import java.util.Vector;

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
	   
	   
   }
}
