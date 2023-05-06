package opps;

interface Interf1{
	 void teaches();// all interface by default public and abstract
	 void writeCodes();
	 
	 default void m1() { // participates in inheritance
		 System.out.println("from java 8 onwards normal method is allowed");
	 }
	 
	 static void m2() { // will not participate in inheritance
		 System.out.println("with static method we can also create the method with implementation");
	 }
	 
	 private void m3() { // java 9
		 System.out.println("I am private method");
	 }
	 
	 
}


class Students12 implements Interf1{
	public void teaches() {
		System.out.println("Mobin teaches the coding");
	}
	
	public void writeCodes() {
		System.out.println("Mobin Writes the code");
	}
	
}


public class LaunchInterf {

	public static void main(String[] args) {
		Students12 st1 = new Students12();
		st1.m1();
      
		Interf1.m2(); 
        
	}

}
