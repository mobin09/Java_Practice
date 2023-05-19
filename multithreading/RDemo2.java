package multithreading;

class Display {
	public synchronized  void wish(String name) {

		for (int i = 0; i < 10; i++) {
			System.out.println("Good Evening: " + name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
		
		
	}
}

class MyTHreadRDemo2 extends Thread {
	Display d;
	String name;

	MyTHreadRDemo2(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}

}

class RDemo2 {

	public static void main(String[] args) {
		Display d = new Display();
		MyTHreadRDemo2 t1 = new MyTHreadRDemo2(d, "Mobin");
		MyTHreadRDemo2 t2 = new MyTHreadRDemo2(d, "washim");
        t1.start();
        t2.start();
	}

}
