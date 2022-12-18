package exceptionHandling;

public class ThrowKeywordExample {

	static void withoutThrow() {
		System.out.println(10/0); /* Here Exception is Object is created and hand over to JVM internally
		 and Default Exception Handler prints the Exception Object to the Console
		*/
	}
	
	static void withThrow() {
		throw new ArithmeticException("It is raqised bcz you divide by 0"); // we creating the exception object
		// manually---explicitly
	}
	
    static void checkEligibility(int age) {
    	if(age < 18) {
    		throw new ArithmeticException("Invalid Age");
    	} else {
    		System.out.println("Eligible for the vote !!");
    	}
    } 
	
	public static void main(String[] args) {
		
		//withoutThrow();
		//withThrow();
		checkEligibility(13);
	}

}
