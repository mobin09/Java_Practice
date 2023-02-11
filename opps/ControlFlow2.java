package opps;

public class ControlFlow2 {

	private static String m1(String msg) {
		System.out.println(msg);
		return msg;
	}
	
	ControlFlow2(){
		m = m1("1");
	}
	
	{
		m = m1("2");
	}
	
	String m = m1("3");
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlFlow2 s = new ControlFlow2();

	}

}
