package opps;


// Overriding the Method -- at run time


class Parent {
	public void property() {
		System.out.println("Cash + Land + Gold");
	}
	
	public void marry() {
		System.out.println("Abcd");
	}
	
}


class C extends Parent{
	@Override
	public void marry() {
		System.out.println("Katrina || Ashna");
	}
}


public class OverridingExampl1 {

	public static void main(String[] args) {
		C child = new C();
		child.marry();

	}

}
