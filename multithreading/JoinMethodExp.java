package multithreading;


class MyThread7 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println("Exception is caught");
			}
		}
		
		
		
		
	}
}


class MyThread8 extends Thread{
	
	static Thread mt;
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
			try {
				mt.join(); // child thread will wait untill main thread completes its execution
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class JoinMethodExp {

	public static void main(String[] args) {
//       MyThread7 t = new MyThread7();
//       t.start();
//       try {
//    	   t.join(4000, 10); // in this case main thread is waiting ...
//       }catch(InterruptedException e) {
//    	   System.out.println(e);
//       }
//       
//       for(int i=0; i<10; i++) {
//    	   System.out.println("Main Thread");
//       }
       

		MyThread8.mt = Thread.currentThread();
		MyThread8 t = new MyThread8();
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			}
		}
		
		
		
		
	}


