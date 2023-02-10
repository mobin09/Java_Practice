package opps;

// This Example is for practice and learning 

public class StaticBlock {
	// number of ways to print to the console
	// there are lot of ways some are here
	//1.
	static {
		System.out.println("I can print from static block");
		System.exit(0);
	}
	//2.
	static StaticBlock s = new StaticBlock();
	{
		System.out.println("I can print from instance");
	}
	
	//3.
	static int x  =m1();
	
	public static int m1(){
		System.out.println("I can print");
		System.exit(0);
		return 10;
	}
	
	static StaticBlock st = new StaticBlock();
	
	StaticBlock()
	{
		System.out.println("I can print from constructor");
		System.exit(0);
	}
	
	
}
