package opps;

class ParentA {
	public void cry() {
		System.out.println("Parent A is crying");
	}
}

class ChildA extends ParentA {
	@Override
	public void cry() {
		System.out.println("Child A is crying at low voice");
	}
}

class ChildB extends ParentA {
	@Override
	public void cry() {
		System.out.println("Child B is crying at high voice");
	}
}

public class LaunchOverr {

	public static void main(String[] args) {
		ChildA c1 = new ChildA();
		ChildB c2 = new ChildB();

		c1.cry();
		c2.cry();
       ParentA p;
       p = c1;
       p.cry();
       p = c2;
       p.cry();
	}

}
