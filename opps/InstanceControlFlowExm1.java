package opps;

public class InstanceControlFlowExm1 {

	int i = 10;
	{
		m1();
		System.out.println("First Instance block");
	}
	
	
	InstanceControlFlowExm1(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceControlFlowExm1 t =new InstanceControlFlowExm1();
		System.out.println("Main");

	}
	
	public void m1() {
		System.out.println(j);
	}
	
	{
		System.out.println("Second Instance block");
	}
	
	
	int j=20;

}
