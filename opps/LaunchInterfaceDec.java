package opps;

/**
 * 
 * @author Mobin Arshad
 *
 */

interface Sample{
	void m1();
	void m2();
}

abstract class Asample implements Sample {
	@Override
	public void m2() {
		System.out.println("implementation of m2");
	}
} 

class SampleImpl extends Asample{
	@Override
   public void m1() {
	   System.out.println("implementation of m1");
   }
	
}


public class LaunchInterfaceDec {

	public static void main(String[] args) {
		
      Sample s = new SampleImpl(); // loose coupling, parent reference can be used to hold child object
      s.m1();
      s.m2();
	}

}
