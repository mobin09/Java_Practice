package opps;



class Parent8{
	
	int i = 10;
	{
		m1();
		System.out.println("Parent Instance Block");
	}
		
	Parent8(){
		System.out.println("Parent Constructor");
	}
	
  public static void main(String[] args) {
	  Parent8 p = new Parent8();
	  System.out.println("Parent Main");
  }	
	public void m1() {
		System.out.println(j);
	}
	
	int j = 20;
	
}

public class InstanceControlFlowExm2 extends Parent8 {
    int x = 100;
    {
    	m2();
    	System.out.println("child first instance block");
    }
	
    public void m2() {
    	System.out.println(y);
    }
    
    InstanceControlFlowExm2(){
    	System.out.println("Child Constructor");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceControlFlowExm2 i = new InstanceControlFlowExm2();
		System.out.println("Child main method");
	}
	
	{
		System.out.println("Child Second instance block");
	}
	
	int y = 200;
	

}
