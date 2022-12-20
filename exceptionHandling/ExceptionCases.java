package exceptionHandling;

public class ExceptionCases {

	public static void main(String[] args) {
		//throw new Exception(); //this will give the compile time exception
		//throw new Error(); // this code compiles fine bt at run time give the Error
		//first();
		//second();
		fifth();
	}

	public static void first() {
		try {
			System.out.println("Hello");
		}catch(ArithmeticException e) {}
	}
	
	static void second() {
		try {
			System.out.println("Hello");
		}catch(Exception e) {
			
		}
	}
	
//	static void third() {
//		try {
//			System.out.println("Hello");
//	}catch(IOException e) {}
//	}

//	static void fourth() {
//		try {
//			
//			System.out.println("Hello");
//			
//		}catch(InterruptedException e) {}
//	}
	
	static void fifth() {
		try {
			System.out.println("Fifth");
		}catch(Error e) {
			
		}
	}
	
	
}
