package snippets;

class Test17 {
	
	
	// Overloaded of add method --> compile time polymorphism
	// From 1.5 single method can handle any type of arguments of same type parameter (var-arg)
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void add(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	
	public static void main(String[] args) {
       Integer i1= 10;
       Integer i2 = 10;
       System.out.println(i1 == i2);
       
       Integer i3 = Integer.valueOf(30);
       Integer i4 = Integer.valueOf(30);
       System.out.println(i3 == i4);
       
       Integer i5 = Integer.valueOf(10);
       System.out.println(i1 == i5);
	}
}
