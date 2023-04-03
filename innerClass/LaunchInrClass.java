package innerClass;


class A{
	;;;;;;;;
	;;;;;;;
	class B{
		 int i=20;
	}
}

class Outer{
	
	
	
	public void m2() {
		Inner i = new Inner();
		i.m1();
	}
	
	class Inner{
		public void m1() {
			System.out.println("Inner class Method");
		}
	}
}

public class LaunchInrClass {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		System.out.println(b.i);
 
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
		
		o.m2();
		
		Outer.Inner iner =  new Outer().new Inner();
		iner.m1();
		
	}

}
