package opps;

// we can't decrease the visibility of the Inherited methods

class Demo01 {

	void saySomething() {
		System.out.println("Hi, I am parent");
	}

	public void greet() {
		System.out.println("Hi, How are you");
	}

}

class Demo02 extends Demo01 {
	public void saySomething() {
		System.out.println("I am, child overriding the methods");
	}

	public void greet() {
		System.out.println("Welcome to this");
	}

}

public class Launch1 {

	public static void main(String[] args) {
		Demo01 d = new Demo02();
		d.saySomething();
		d.greet();
	}

}
