package stringAssignment;

/**
 * WAP to implement Pangram Checking with least inbuilt methods being used.
 * @author Mobin Arshad
 *
 */

public class Pangram {

	public static void main(String[] args) {
		String str = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		int[] arr = new int[26];
		
		str = str.replace(" ", "").toUpperCase();
		//System.out.println(str);
		
		
		for(int i=0; i<str.length(); i++) {
			int id = str.charAt(i)-65;
			arr[id]++;
		}
		
		boolean checkIsPanGram = true;
		
		for(int num : arr) {
			if(num ==0) {
				checkIsPanGram = false;
				break;
			}
		}
		
		if(checkIsPanGram) {
			System.out.println("PANGRAM");
		}else {
			System.out.println("NOT PANGRAM");
		}
		
		

	}

}
