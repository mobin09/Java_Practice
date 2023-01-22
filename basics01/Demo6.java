package basics01;

// for  Loops

public class Demo6 {

	public static void main(String[] args) {
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		// for Loops
		int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.println("*");
		}

		for (int i = 0; i < n; i++) {
			System.out.print("* ");
		}

		// while Loops
		System.out.println();
		
		int x = 1;
		while(x <=n) {
			System.out.print("& ");
			x++;
		}
		System.out.println();
    // do while loop
		
		int d = 1; 
		do { // at least one time it will executed
			System.out.println("M");
			d++;
		}while(d <=n);
		
	}

}
