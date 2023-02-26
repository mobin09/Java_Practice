package assignments;

import java.util.Scanner;

public class GuesserGame {

	public static void main(String[] args) {
		System.out.println("**********Number Guesser************");
		int luckyNumber  = (int)(Math.random()*10) + 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("number of times you want to get chance ?");
		
		int liveTimes = sc.nextInt();
		if(liveTimes <= 0) {
			System.out.println("Only Positive numbers are allowed. hitns:number > 0");
		}
		
		while(liveTimes > 0) {
			System.out.println("Choose Lucky Number");
			int chooseNumber = sc.nextInt();
			int x = liveTimes;
			if(luckyNumber == chooseNumber) {
				System.out.println("Huurah You choose the number");
				return;
			}else {
				--x;
				if(x==0) {
					System.out.println("No chance left to continue");
				}else {
					System.out.println("Ohh!, Chance left only: "+ x );
				}
				
			}
			
			liveTimes--;
		}
		
		sc.close();
		
		
		if(liveTimes == 0 ) {
			System.out.println("You Failed");
		}
		

	}

}
