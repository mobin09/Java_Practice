package opps;

public class ControlFlow {

	{
		System.out.println("FIB");
	}
	
	static {
		System.out.println("FSB");
	}
	
	ControlFlow(){
		System.out.println("Constructor");
	}
	
	
	public static void main(String[] args) {
		ControlFlow c1 = new ControlFlow();
		System.out.println("Main");
		ControlFlow c2 = new ControlFlow();

	}
	
	static {
		System.out.println("SSB");
	}
	
	{
		System.out.println("SIB");
	}

}
