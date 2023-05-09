package opps;

class Dem12<T extends Number>{ // Number type or its child class
	
}

class Sample12<T extends Runnable>{ // Runnable type or its implemented class
	
}

public class LaunchCustomGenerics {

	public static void main(String[] args) {
		
      Dem12<Number> d = new Dem12<Number>();
      //Demo12<String> d1 = new Demo12<String>();
      Sample12<Runnable> s1 = new Sample12<Runnable>();
      Sample12<Thread> s2 = new Sample12<Thread>();
	}

}
