package opps;

public class OppsLaunch2 {
    int i = 10;
	public static void main(String[] args) {
		// System.out.println(i); //static methods only access the static value
		// other wise we need to create it object
		OppsLaunch2 o = new OppsLaunch2();
		System.out.println(o.i);
		
		o.callMethod();
		
		int d;
		d=10;
		System.out.println(d);
		
		
		int x = 10;
	final int y = 20;
		switch(x) {
		case 10:
			System.out.println("Hello");
			break;
			
		case y:
			System.out.println("Hiii");
			break;
		}
		

	}
	
	void callMethod() {
		System.out.println(i);
	}
	
	
	

}
