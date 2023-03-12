package stringAssignment;

import java.util.Arrays;

/**
 * WAP to implement Anagram Checking least inbuilt methods being used.
 * 
 * @author Mobin Arshad
 *
 */

public class CkeckAnagram {

	public static void main(String[] args) {
		String str1 = "bat";
		String str2 = "tab";
		
		str1 = str1.replace(" ", "").toUpperCase();
		str2 = str2.replace(" ","").toUpperCase();
		
		char[] chrs1 = str1.toCharArray();
		char[] chrs2 = str2.toCharArray();
		Arrays.sort(chrs1);
		Arrays.sort(chrs2);
		
		boolean isAnagram = true;
		
		for(int i=0; i<chrs1.length; i++) {
			if(chrs1[i] != chrs2[i]) {
				isAnagram = false;
			}
		}
		
		
		if(isAnagram) {
			System.out.println("It is Anagram");
		}else {
			System.out.println("It is not Anagram");
		}
		

	}

}
