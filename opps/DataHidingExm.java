package opps;

public class DataHidingExm {
    private double balance; // declared variable as private
	
    public double getBalance() {
    	// Authentication
    	return balance;
    }
    
	public static void main(String[] args) {
		System.out.println(new DataHidingExm().getBalance());
	}

}
