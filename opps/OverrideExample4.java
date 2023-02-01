package opps;


class P5{
	public static void m1() {
		System.out.println("Class level method");
	}
}

class C5  extends P5{
//	public void m1() {      // we will get compile time issues
//		System.out.println("Overriding of m1");
//	}
}


public class OverrideExample4 {

	public static void main(String[] args) {
		
       System.out.println(Short.MIN_VALUE +" " + Short.MAX_VALUE);
       
       double r, pi, a;
       r = 9.8;
       pi = 3.14;
       a = pi * r * r;
       System.out.println(a);
       
       System.out.print(10  *  20 + "Quiz ");
       System.out.println("Quiz" + 10 * 20);
       
       
	}

}
