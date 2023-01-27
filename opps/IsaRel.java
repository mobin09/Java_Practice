package opps;


class P{
	public void m1() {
		System.out.println("Parent");
	}
}

class Child extends P{
	public void m2() {
		System.out.println("Child");
	}
}


public class IsaRel {

	public static void main(String[] args) {
		P p = new P();
		p.m1();
		//p.m2(); CE:
		
		Child c = new Child();
		c.m1();
		c.m2();
		
	   P p1 = new P();
	   p1.m1();
	   //p1.m2();// CE:
	   
	   //Child c = new P();
	   
	   
	   
		

	}

}
