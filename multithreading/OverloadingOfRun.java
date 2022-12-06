package multithreading;

class MyThread1 extends Thread{
	
	public void run() { // no-args run() method is called by start method
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
		run(20);
	}
	
	public void run(int x) {
		System.out.println("run() with args");
	}
	
}

public class OverloadingOfRun {

	public static void main(String[] args) {
		MyThread1 th = new MyThread1();
		th.start();

		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
		
		// overloaded run method will called just like normal mrthod
		// e.g
		//th.run(10);
		
		
	}

}
