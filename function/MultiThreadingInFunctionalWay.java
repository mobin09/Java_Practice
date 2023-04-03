package function;

public class MultiThreadingInFunctionalWay {

	public static void main(String[] args) {
		
		Runnable r = ()-> {
			for(int i=0; i<=5; i++) {
				System.out.println("Child Thread");
			}
			
		};
		
		Thread t = new Thread(r);
		
		t.start();
		System.out.println("Main thread");
		System.out.println("End of Main thread");
		

	}

}
