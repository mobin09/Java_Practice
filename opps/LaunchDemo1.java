package opps;

interface One {
	void m1();
}

class Two {
	public void m2() {
		System.out.println("I am from class two");
	}
}

class LaunchDemo1 extends Two implements One {

	@Override
	public void m1() {
		System.out.println("Interface m1 methods");
	}

	public static void main(String[] args) {

	}

}
