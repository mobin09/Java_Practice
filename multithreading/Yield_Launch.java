package multithreading;

class MyThread6 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
	
}

public class Yield_Launch {

	public static void main(String[] args) {
		
		MyThread6 t = new MyThread6();
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
		

	}

}
