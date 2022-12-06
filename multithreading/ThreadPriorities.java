package multithreading;


class MyThread5 extends Thread{

	@Override
	public void run() {
		System.out.println("Child Thread Priority: " + Thread.currentThread().getPriority());
		for(int i=0; i<5; i++) {
			System.out.println("child Thread");
		}
	}
}

public class ThreadPriorities {

	public static void main(String[] args) {
		
		MyThread5 t = new MyThread5();
		t.setPriority(10);
		t.start();
		
		System.out.println("Main Thread Priority: " +Thread.currentThread().getPriority());
		for(int i=0; i<5; i++) {
			System.out.println("Main Thread");
		}

	}

}
