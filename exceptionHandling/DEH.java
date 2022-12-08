package exceptionHandling;

// This code contain an exception ... Default Exception Handler

public class DEH {

	public static void doStuff() {
		doMoreStuff();
	}
	
	public static void doMoreStuff() {
		System.out.println(10/0);
	}
	
	
	public static void main(String[] args) {
		doStuff();
	}
	
}

/*
 * JVM will search the main method
 * control goes to main method ... main() entry goes to Stack Frame
 * control goes to do stuff .................................
 * control goes to do moreStuff ....................
 * doMoreStuff
 * 
 * */


