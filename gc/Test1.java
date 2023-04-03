package gc;

class Test1 {
	public static void main(String[] args) {
		String s = new String("Mobin Arshad Khan");
		s = null;
		System.gc();
		System.out.println("End of Main");
	}	
	public void finalize() {
		System.out.println("Finalize method called");
	}
}

class test2{
	public static void main(String[] args) {
		Test1 t = new Test1();
		t = null;
		System.gc();
	}
}
