package multithreading;


class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
		

	}

}
