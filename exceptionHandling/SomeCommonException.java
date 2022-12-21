package exceptionHandling;

import java.util.ArrayList;
import java.util.Iterator;

public class SomeCommonException {

	
	//static int x = 10/0; // ExceptionInInitializerError
	
	static {
		String s = null;
		//System.out.println(s.length()); // ExceptionInInitializerError
	}
	
	public static void m1() {
		m2();
	}
	
	public static void m2() {
		m1();
	}
	
	public static void main(String[] args) {	
         int[] a = new int[10];
         //for(int i=0; i<10; i++) {
        	 //System.out.println(a[i]);
         //}
         
         //System.out.println(a[10]); //java.lang.ArrayIndexOutOfBoundsException 
         
         String name = "Mobin";
         System.out.println(name.length());
         name = null;
         //System.out.println(name.length()); // NullPointerException
         //m1(); //StackOverflowError
         
         //IllegalArgumentException
         Thread t = new Thread();
         t.setPriority(10);
         //t.setPriority(12); // IllegalArgumentException
         
         t.start();
         //t.start();  // IllegalThreadStateException 
         
         ArrayList<String> al = new ArrayList<>();
         al.add("A");
         al.add("B");
         al.add("C");
         
         Iterator itr = al.iterator();
         while(itr.hasNext()) {
          Object obj = itr.next(); // if we comment this line we will get IllegalStateException 
          itr.remove();
         }
         System.out.println(al);
         
         
         
		
	}
	
	public static void ClassTypeCastExceptionExm() {
		String str = new String("Mobin");
		Object o = (Object)str; // we can typecast child class to its parent --Acceptable
		
		Object o1 = new Object();
		//String s = (Sring) o1;
	   	
		
		
	}
	
}
