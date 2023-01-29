package opps;


class Test1 {
	public void m1() {
		System.out.println("no-args");
	}
	
	public void m1(int i) {
		System.out.println("Int args");
	}
	
	public void m1(double d) {
		System.out.println("double args");
	}
	
}

public class OverloadingEx2 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m1();
		t.m1(10);
		t.m1(10.5);
		t.m1('a');
		
		t.m1(10l);
		t.m1(10.05f);
		

	}

}
