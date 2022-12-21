package exceptionHandling;

public class SomeCommonException {

	
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
		
	}

}
