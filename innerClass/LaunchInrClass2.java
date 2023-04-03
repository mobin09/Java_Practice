package innerClass;

/**
 * 
 * @author mobin
 *
 */

class Outer1{
	int x = 10;
	static int y = 20;
	int z = 100;
	class Inner{
		int m = 0;
		public void m1() {
			int z = 15;
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(Outer1.this.z);
			System.out.println(this.m);
		}
	}
}


public class LaunchInrClass2 {

	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Outer1.Inner i = o.new Inner();
		i.m1();

	}

}
