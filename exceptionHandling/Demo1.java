package exceptionHandling;

public class Demo1 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.toString());
			e.printStackTrace(); // complete information
			System.out.println(e.getMessage()); // description
		}
		

	}

}
