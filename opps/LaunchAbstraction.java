package opps;



abstract class ATMService{
	 abstract public void display();
}

class ATM extends ATMService {
	
	  public void display() {
		  System.out.println("ATM is running");
	  }
}

public class LaunchAbstraction {

	public static void main(String[] args) {
		
		ATM aa = new ATM();
		aa.display();
		
	}

}
