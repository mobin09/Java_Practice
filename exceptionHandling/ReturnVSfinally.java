package exceptionHandling;

public class ReturnVSfinally {

	
	static int returnNum() {
		
		try {
			return 1;
			
		}catch(Exception e) {
			return 2;
		} finally{
			System.out.println("Finally will executed even after return statement in a method");
		}
	}
	
	public static void main(String[] args) {
	     System.out.println(returnNum());	

	}

}
