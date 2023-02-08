package opps;

public class StaticControlFlow {

	static int x = 10;
	
	static {
		m1();
		System.out.println("First Static block");
	}
	
	public static void main(String[] args) {
		m1();
		System.out.println("Main Method");

	}
	
	public static void m1() {
		System.out.println(j);
	}
	
	static {
		System.out.println("Second Static block");
	}
	
	static int j = 20;
	

}
