package multithreading;

class MyThread9 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				System.out.println("I got interrupted");
			}
			
		}
	}
}


public class InterruptedExceptionDemo {

	public static void main(String[] args) {
		 MyThread9 t = new MyThread9();
		 t.start();
		 t.interrupt();
		 System.out.println("End of Main Thread");
        
	}

}
