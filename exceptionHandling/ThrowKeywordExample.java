package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
    		throw new ArithmeticException("Invalid Age"); // Unchecked Exception
    	} else {
    		System.out.println("Eligible for the vote !!");
    	}
    } 
    
    // Checked Exception
    public static void method() throws FileNotFoundException {
    	FileReader file = new FileReader("abc.txt");
    	BufferedReader br = new BufferedReader(file);
    	
    	throw new FileNotFoundException();
    	
    }
	
	public static void main(String[] args) {
		
		//withoutThrow();
		//withThrow();
		//checkEligibility(13);
//		try {
//			method();
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//			
//		}
		
		try {
		throw new UserDefinedException("User Defined Exception is Raised");
		}catch(UserDefinedException e) {
			String s =  e.getMessage();
			System.out.println(s);
		}
		
		
	}

}

// Throwing user defined Exception

class UserDefinedException extends Exception{
	
	public UserDefinedException(String str) {
		super(str); // calling Constructor of parent exception
	}
}



