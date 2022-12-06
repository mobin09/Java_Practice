package multithreading;


class MyThread2 extends Thread{
	
	@Override
	public void start() {
		super.start();
		
		System.out.println("Override of start method"); // executed by main thread
	}
	
	@Override
	public void run() { 
		for(int i=0; i<10; i++) { // job of the thread
			System.out.println("Child Thread");
		}
	}
	
}


public class OverrideOfStart {

	public static void main(String[] args) {
		MyThread2 th = new MyThread2();
		th.start();

	}

}
