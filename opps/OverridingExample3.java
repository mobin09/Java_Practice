package opps;


class P4{
	public void m1() {
		System.out.println("Parent Method");
	}
}

class C4 extends P4{
	public void m1() {
		System.out.println("Child Method");
	}
	
}


public class OverridingExample3 {

	public static void main(String[] args) {
		P4 p = new C4();
		p.m1();
	}

}
