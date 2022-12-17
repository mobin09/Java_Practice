package exceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println("Outer try block");
			try {
				System.out.println("Inner try block");
				System.out.println(10/0);
			}catch(ArithmeticException e) {
				System.out.println("Inner Catch block");
			}
			
			System.out.println("Outside of Inner try-catch block");
			
		}catch(Exception e) {
			System.out.println("Outer Catch Block");
		}finally {
			System.out.println("Outer finally block");
		}
		

	}

}
