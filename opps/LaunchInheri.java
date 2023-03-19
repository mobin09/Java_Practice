package opps;

class Parentt {
	int a;
	int b;

	Parentt() {
		a = 10;
		b = 20;
		System.out.println("Parent Constructor with zero parameterized");
	}

	Parentt(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Parent Constructor with the 2 parameterized");
	}
}

class Childd extends Parentt {
	int x;
	int y;

	Childd() {
		x = 100;
		y = 200;
		System.out.println("Child constructor with the zero parameterized");
	}

	Childd(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Child construcotr with the 2 parameterized");
	}

	public void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}

public class LaunchInheri {

	public static void main(String[] args) {
		Childd ch = new Childd();
		ch.disp();
		
		Childd ch1 = new Childd(1000, 2000);
		ch1.disp();

	}

}
