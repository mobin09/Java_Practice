package stringAssignment;

/**
 * WAP to print Duplicates characters from the String.
 * 
 * @author Mobin Arshad
 *
 */


public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		String  str = "ABCDEFGHAAABCDmnmn";
		str = str.replace(" ","").toUpperCase();
		
		int[] arr = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int id = ch-65;
			arr[id]++;
		}
		
	    for(int i=0; i<arr.length; i++) {
	    	if(arr[i] >1) {
	    		System.out.println((char)(i+65) +":"+arr[i] );
	    	}
	    }
		

	}

}
