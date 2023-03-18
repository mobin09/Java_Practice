package opps;

/**
 * Example of custom singleton class and Factory method
 * @author Mobin Arshad
 *
 */

class DemoSingleTon {
	private static DemoSingleTon t = null;
	private DemoSingleTon() {
	}
	public static DemoSingleTon getDemoSingleTon() {
		if (t == null) {
			t = new DemoSingleTon();
		}
		return t;
	}
}
public class LaunchSingleton {
	public static void main(String[] args) {
		DemoSingleTon t1 = DemoSingleTon.getDemoSingleTon();
		DemoSingleTon t2 = DemoSingleTon.getDemoSingleTon();
		System.out.println(t1 == t2);
	}
}
