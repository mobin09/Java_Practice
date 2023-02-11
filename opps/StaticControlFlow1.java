package opps;

class Base {
	static int i = 10;
	static {
		m1();
		System.out.println("Base static Block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Base Main method");
	}

	public static void m1() {
		System.out.println(j);
	}

	static int j = 20;

}

public class StaticControlFlow1 extends Base {
	static int x = 100;
	static {
		m2();
		System.out.println("Child static block");
	}

	public static void main(String[] args) {

		m2();
		System.out.println("Child main");
	}

	public static void m2() {
		System.out.println(j);
	}

	static {
		System.out.println("Second Child static block");
	}

	static int j = 200;
}
