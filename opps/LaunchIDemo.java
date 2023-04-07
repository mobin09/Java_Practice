package opps;

/**
 * 
 * @author Mobin
 * Our main aim to provide the implementation of m3() method only
 */

interface IDemo{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
}

abstract class AdaptorDemo implements IDemo{
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
	public void m5() {}
	
}

public class LaunchIDemo extends AdaptorDemo {
    
	@Override
	public void m3() {
		System.out.println("Implementation of m3");
	}
	
	public static void main(String[] args) {
		
		IDemo pr = new LaunchIDemo();
		pr.m3();
	}

}
