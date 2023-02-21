package basics01;

import java.util.Scanner;

// taking the input from the console

public class TakingInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int a = sc.nextInt();
		
		System.out.println("Entered number is"+a);
		
		System.out.println("Enter the no. of Students");
		int students = sc.nextInt();
		int[] marks = new int[students];
		System.out.println("Enter the marks of " + students + " Students" );
		for(int i=0; i<students; i++) {
			marks[i] = sc.nextInt();
		}
		
	    sc.close();
	    
	    // display the marks of the students
	    
	    for(int mark: marks) {
	    	System.out.print(mark+ " ");
	    }
	    
	    System.out.println();
		
		
		

	}

}
