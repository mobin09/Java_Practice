package exceptionHandling;

public class ThrowKeywordExample {

	static void withoutThrow() {
		System.out.println(10/0); /* Here Exception is Object is created and hand over to JVM internally
		 and Default Exception Handler prints the Exception Object to the Console
		*/
	}
	
	public static void main(String[] args) {
		
		withoutThrow();
		

	}

}
