package stringAssignment;

/**
 * WAP to check if “2552” is palindrome or not.
 * @author Mobin Arshad
 *
 */

public class CheckForPalindrome {

	public static String reverseString(char[] ch) {
		int i=0;
		int j = ch.length-1;
		while(i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		
		return String.valueOf(ch);
		
	}
	
	public static void main(String[] args) {
		String str = "2552";
		str = str.replace(" ", "");
		String reverse = reverseString(str.toCharArray());
        //System.out.println("Reverse String:"+ reverse);
        
        if(str.equals(reverse)) {
        	System.out.println("IT is Palindrome");
        }else {
        	System.out.println("It is not Palindrome");
        }
        
	}

}
