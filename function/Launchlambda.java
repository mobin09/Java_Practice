package function;

/** @Mobin Arshad
 * Lambda Expression:- It is used to implement the functional interface 
 * 
 */

@FunctionalInterface
interface A{
	public void m1();
}
interface AMaths{
	public int add(int a, int b);
}

interface square{
	public int squareit(int a);
}

public class Launchlambda {
	public static void main(String[] args) {
		A m = ()-> System.out.println("Hello world");
		m.m1();

		AMaths ma = (a,b) -> a+b;
		System.out.println(ma.add(40, 30));
		
		square sq = a -> a *a;
		System.out.println(sq.squareit(30));
		
	}

}
