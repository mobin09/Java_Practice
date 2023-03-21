package opps;

/**
 * final class: if we make class as a final then we can't inherit it.
 * final method: we can not override the final methods.
 * final variable: we can not re-assign it.
 * @author Mobin
 *
 */

final class Vech1 {
	// we can't inherit It because it is the final class
}

class Vechicle {
	private String price = "20L";

	final public void disp() { // we can't override this because of final method
		System.out.println("The Vechicle price is:" + price);
	}
}

class Car24 extends Vechicle {
	final int y = 20; // we can not change it bcz of final
}

public class LaunchFinal {

	public static void main(String[] args) {
		Car24 c1 = new Car24();
		c1.disp();

	}

}
