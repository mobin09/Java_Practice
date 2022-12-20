package exceptionHandling;

public class FinalizeExm {

	public static void main(String[] args) {
		FinalizeExm obj = new FinalizeExm();
		System.out.println(obj.hashCode());
		
		obj = null;
        // calling the garabge collector
		System.gc();
		System.out.println("End of Garbage Collector");
		
	}
	
	protected void finalize() {
		System.out.println("finalize method called");
	}
	

}
