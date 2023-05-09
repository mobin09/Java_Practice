package opps;

import java.util.ArrayList;

class Dem12<T extends Number>{ // Number type or its child class
	
}

class Sample12<T extends Runnable>{ // Runnable type or its implemented class
	
}

interface I1 {}

interface I2{}
interface I3{}
interface I4{}
interface I5{}

interface intf1 extends I1, I2, I3, I4{}

public class LaunchCustomGenerics {

	
	public static void m1(ArrayList<?> al) {
		System.out.println(al.get(0));
	}
	
	public static void m2(ArrayList<?> al) {
		//al.add("Mobin"); Compile time erorr
		//al.add(2);
		al.add(null); // default v
		
	}
	
	public static void m3(ArrayList<? extends Number> al) {
		 al.add(null);
		
	}
	
	public static void m4(ArrayList<? extends Runnable> al) {
		
	}
	
public static void m5(ArrayList<? super Integer> al) {
		 al.add(null);
		 al.add(5);
	}
	
	
	public static void main(String[] args) {
		
      Dem12<Number> d = new Dem12<Number>();
      //Demo12<String> d1 = new Demo12<String>();
      Sample12<Runnable> s1 = new Sample12<Runnable>();
      Sample12<Thread> s2 = new Sample12<Thread>();
      
      ArrayList<String> a1 = new ArrayList<String>();
      a1.add("Mobin");
      a1.add("Arshad");
      m1(a1);
      
      ArrayList<Integer> a2 = new ArrayList<>();
      a2.add(2);
      a2.add(5);
      m1(a2);
      
      //ArrayList<?> ls = new ArrayList<?>();
      
	}

}
