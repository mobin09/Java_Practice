package opps;

abstract class DEM{
	public void m1() {
		System.out.println("Hiii...");
	}
}


abstract class LoanA {
   abstract	public void displayIntr();
   public void greet() {
	   System.out.println("Welcome to XYZ Bank");
   }
   
}

class HomeLoanA extends LoanA {
    public void displayIntr() {
    	System.out.println("Home Loan Interest is :8.5%");
    }
}

class EducationLoanA extends LoanA {
	public void displayIntr() {
		System.out.println("Education loan interest is: 12.5% ");
	}
}

public class LaunchLoan1 {
	public static void main(String[] args) {
       LoanA l1 = new HomeLoanA();
       l1.displayIntr();
       l1.greet();
       
       LoanA l2 = new EducationLoanA();
       l2.greet();
       l2.displayIntr();
       
      //DEM d = new DEM();
       
       
	}
}
