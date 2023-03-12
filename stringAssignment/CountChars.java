package stringAssignment;

/**
 * WAP to count the number of consonants, vowels, special characters in a String.
 * @author Mobin Arshad;
 *
 */

public class CountChars {

	public static void main(String[] args) {
		String  str="abdol*#ucdmn."; 
		str = str.replace(" ", "");
		String vovels = "AEIOUaeiou";
		
		int consonents = 0;
		int vovelsCount = 0;
		int specialCharCount = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				if(vovels.contains(String.valueOf(ch))) {
					vovelsCount++;
				}else {
					consonents++;
				}
			}else {
				specialCharCount++;
			}
			
			
		}
		
		System.out.println("Vovels Count:"+ vovelsCount);
		System.out.println("consonants Count:"+consonents);
		System.out.println("Special Character counts:"+specialCharCount);
		

	}

}
