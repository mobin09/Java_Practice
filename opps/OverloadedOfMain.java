package opps;

// Can we override the main method
// yes, we can override the main method but JVM only
// check those main method which has String[] args as a parameter

public class OverloadedOfMain {

	public static void main(int[] args) {
		System.out.println("Int main method");
	}
	
	public static void main(String str) {
		System.out.println("String main method");
	}
	
	public static void main(double d) {
		System.out.println("Sobule main method");
	}
	
	public static void main(String[] args) {
		System.out.println("Actual main method");

	}

}
