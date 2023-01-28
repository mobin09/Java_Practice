package opps;

class Test {
	public void m1() {
		System.out.println("no-arg");
	}
	
	public void m1(int i) {
		System.out.println("int-args");
	}
	
	public void m1(double d) {
		System.out.println("double args");
	}
	
	
}

public class OverloadingEx1 {

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m1(10);
		t.m1(10.5);

	}

}
