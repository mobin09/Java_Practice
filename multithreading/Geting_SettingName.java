package multithreading;


class MyThread4 extends Thread{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("run() is executed by " + name);
	}
}

public class Geting_SettingName {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		String name = Thread.currentThread().getName();
		System.out.println("main() is executed by thread named: " + name);
		
		MyThread4 t = new MyThread4();
		t.start();
		System.out.println("Name of  Thread of MyThread4 class: " +t.getName());
		
		Thread.currentThread().setName("Mobin");
		
		//System.out.println(10/0);
		
		
		
		

	}

}
