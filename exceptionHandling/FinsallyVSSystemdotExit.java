package exceptionHandling;

public class FinsallyVSSystemdotExit {

	public static void main(String[] args) {
		try {
			System.out.println("Try Block");
			System.exit(-5);  // This line shutdown the JVM
		}catch(Exception e) {
			System.out.println("Exception is caught");
		}finally {
			System.out.println("Finally Block");
		}

	}

}
