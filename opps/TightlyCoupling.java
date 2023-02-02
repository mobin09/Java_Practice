package opps;

// Example of tightly coupling
class A{
	static int i = B.j;
}

class B{
	static int j = C0.k;
}

class C0{
	static int k = D.m1();
}

class D{
	static int m1() {
		return 10;
	}
}


public class TightlyCoupling {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.i);

	}

}
