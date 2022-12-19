package exceptionHandling;

public class ThrowsExceptionDemo {

	// there are two ways to handle the exception 
	//   1. By using the try-catch
	//   2. By using the throws keyword
	
	static void firstWay() {
		try {
		System.out.println("I am going to sleep");	
		 Thread.sleep(4000);
		System.out.println("I am slept happily"); 
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	static void secondWay() throws InterruptedException { // to delegate responsibility of exception handling to the caller
		System.out.println("I am going to sleep");
		Thread.sleep(3000);
		System.out.println("Slept happily");
	}
	
	public static void main(String[] args) {
		   
	   //Thread.sleep(1000);
		//firstWay();
      try {
		secondWay();
      }catch(InterruptedException e) {
    	  e.printStackTrace();
      }
	}

}
