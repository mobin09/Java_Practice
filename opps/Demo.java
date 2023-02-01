package opps;


class P7{
	int x = 888;
}

class C7 extends P7{
	int x = 999;
}

public class Demo {

	public static void main(String[] args) {
		P7 p = new P7();
		System.out.println(p.x);
		C7 c = new C7();
		System.out.println(c.x);
		
		P7 p1 = new C7();
		System.out.println(p1.x);
		

	}

}
