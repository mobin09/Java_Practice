package stringAssignment;

/**
 * 1. WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
 * 
 * @author Mobin Arshad
 *
 */


public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "aabaac";
		str = str.replace(" ", "").toLowerCase();
		String res = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(!res.contains(String.valueOf(ch))) {
				res += ch;
			}
		}		
		System.out.println(res);		
	}

}
