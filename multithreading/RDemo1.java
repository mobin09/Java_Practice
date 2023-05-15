package multithreading;

// How many ways to define a thread ...
// by extends the thread class and by implements the Runnable interface

class R1MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public void run(int i) { // Overloaded run method is possible but our start() method only call
		// that run method which has 0 arguments
		System.out.println("Overloaded run method");
	}

}


class R1Demo2 implements Runnable{
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}
}

class RDemo1 {

	public static void main(String[] args) {
		R1MyThread t = new R1MyThread();
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
		R1Demo2 r1 = new R1Demo2();
		Thread t2 = new Thread(r1);
		t2.start();
		

	}

}
