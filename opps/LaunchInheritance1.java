package opps;

class Pa {
	public void m1() {
		System.out.println("I am Parent Methods");
	}
	
	public  void m() {
		System.out.println("Parent");
	}
	
}

class ch extends Pa {
	public void m2() {
		System.out.println("I am child Methods");
	}
	
	@Override
	public void m() {
		System.out.println("Child");
	}
	
}

public class LaunchInheritance1 {

	
	static int x = 10;
	
	void add() {
		x = x+ 20;
	}
	
	public static void main(String[] args) {
       ch o = new ch();
       o.m1();
       o.m2();
       
       Pa a = new ch();
       a.m1();
       a.m();
       
       
	}

}
