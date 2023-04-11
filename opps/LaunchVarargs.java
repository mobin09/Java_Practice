package opps;

public class LaunchVarargs {

	public void add(int ...x) {
		for(int ele: x) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	
	
	public void addInt(int ...x) {
		int sum = 0;
		for(int ele: x) {
			sum += ele;
		}		
		System.out.println("SUM of Integer is: "+sum);		
	}
	
	public void m1(int[] ...x) {
		 for(int[] el: x ) {
			 for(int a: el) {
				 System.out.print(a+" ");
			 }
			 System.out.println();
		 }
	}
	
	public void m1(String name, int ...x) {
		
	}
	
	public static void m2(long l) {
		System.out.println("Long-Parameterized method");
	}
	
	public static void m2(Integer i) {
		System.out.println("Integer parameterized methods");
	}
	
	public static void m3(Integer i) {
		System.out.println("m3() Integer-parameterized method");
	}
	public static void m3(int ...x) {
		System.out.println("m3() int var-args methods");
	}
	
	public static void m4(Long l) {
		System.out.println("Long parameterized");
	}
	
	
	public static void main(String[] args) {
		LaunchVarargs l = new LaunchVarargs();
		l.add(); // new int[]{}
		l.add(10, 30); // new int[]{10, 30}
		l.add(30, 40,50); //new int[]{30,40,50}
		
		l.addInt();
		l.addInt(10, 30, 40, -50);
		
		int[] a= {10, 20,30};
		int[] b = {5, 8, 11};
		
		l.m1(a,b);
		int c  = 20;
		m2(c);
        m3(c);
        //m4(c); // CE:
	}

}
