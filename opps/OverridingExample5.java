package opps;


class P6{
	public void m1(int... x) {
		System.out.println("Parent");
	}
}


class C6 extends P6{
//	public void m1(int x) { // it is the example of overloading not overriding
//		System.out.println("Child");
//	}
	
	public void m1(int... y) {
		System.out.println("child");
	}
	
	
	
}


public class OverridingExample5 {

	public static void main(String[] args) {
		P6 p = new P6();
		p.m1(10); // parent
        
		C6 c = new C6();
		c.m1(20); // child
		
		P6 p1 = new C6();
		p1.m1(30);// parent
		
		
		
	}

}
