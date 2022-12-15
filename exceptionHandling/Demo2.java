package exceptionHandling;

// try with multiple catch block


public class Demo2 {

	
	static void secondExampleForCatch() {
		int[] b = new int[5];
		
		try {
			System.out.println(b[10]);
		}catch(ArithmeticException e) {
			System.out.print("Arithmetic Exception Occurs");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException Occurs");
		}catch(Exception e) {
			System.out.println("Parent Exception Occurs");
		}
	}
	
	
	static void firstExampleOfCatch() {
        int[] a = new int[5];
		
		try {
			a[5] = 30/0;
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException Occurs");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occurs");
		}catch(Exception e) {
			System.out.println("Parent Exception Occurs");
		}
		
		System.out.println("Rest of the code");
	}
	
	
	static void thirdExampleOfCatch() {
		// try with multiple exception
		int[] a = new int[5];
		try {
			a[5] = 30/0;
			System.out.println(a[10]);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException Occurs");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occurs");
		}catch(Exception e) {
			System.out.println("Parent Exception Occurs");
		}
		System.out.println("Rest of the code");
	}
	
	
	
	static void fourthExampleOFCatch() {
		// Not handling the specific Exception the parent exception catch block handle it
		String s = null;
		
		try {
			System.out.println(s.length());
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException Occurs");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException Occurs");
		}catch(Exception e) {
			System.out.println("Patrent Exception occurs");
		}
		
		System.out.println("Rest of the Code");
		
	}
	
	
	static void fifthExample() {
		int[] a = new int[5];
		
		try{
			System.out.println(a[10]);
		}catch(Exception e) {
			System.out.println("Parent Exception occurs");
		}//catch(ArrayIndexOutOfBoundsException e) {
			// unreacable block not following the most specific to most general
		//}
	}
	
	
	
	public static void main(String[] args) {
		
		//firstExampleOfCatch();
		//secondExampleForCatch();
		//thirdExampleOfCatch();
		//fourthExampleOFCatch();
		fifthExample();
	}

}
