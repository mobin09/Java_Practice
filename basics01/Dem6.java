package basics01;

public class Dem6 {
	
	public static void main(String[] args) {
		
		String str = new String("Mobin Arshad");
		str = null;
		System.gc();
		
		System.out.println("End of the program");

	}
	
	
	@Override
	public void finalize() throws Throwable {
		try {
			System.out.println("Finalize is called");
		}catch(Throwable e) {
			
		}finally {
			super.finalize();
		}
		
		
	}
	

}
