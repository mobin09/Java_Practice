package opps;

class Demo3 {
	static int a;
	static int b;
	static {
		System.out.println("Static Block");
		a = 10;
		b = 20;
	}
	
	static void disp() {
		System.out.println("Static Method");
		System.out.println(a);
		System.out.println(b);
	}
	
	int x;
	int y;
	{
		System.out.println("Instance Block");
		x = 3;
		y = 7;
	}
	
	void disp1() {
		System.out.println("Instance Method::");
		System.out.println(x);
		System.out.println(y);
	}
	
	Demo3(){
		System.out.println("Constructor");
	}
	
}

public class StaticLaunch {

	public static void main(String[] args) {
        Demo3.disp();
        
        Demo3 d= new Demo3();
        d.disp1();
        
	}

}
