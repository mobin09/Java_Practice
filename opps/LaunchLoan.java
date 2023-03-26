package opps;
import java.util.Scanner;




class FarmerLoan{
	private double principle;
	private static double rInterest;
	private double time;
	private double simpleI;	
	
	static {
		rInterest = 7.5;
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Farmer Please enter the required loan amount");
		principle = sc.nextDouble();
		System.out.println("Kindly mention the Time duration to repay");
		time = sc.nextDouble();
		//sc.close();
	}	
	public void compute() {
		simpleI = (principle * rInterest * time)/100;
	}	
	public void display() {
		System.out.println("Simple Interest:" + simpleI);
	}	
}
public class LaunchLoan {
	public static void main(String[] args) {
	
		FarmerLoan f1 = new FarmerLoan();
		f1.input();
		f1.compute();
		f1.display();
		
		FarmerLoan f2 = new FarmerLoan();
		f2.input();
		f2.compute();
		f2.display();
	}

}
