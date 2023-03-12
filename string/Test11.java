package string;

/**
 * Palindrome Program
 * 
 *
 */


class Test11 {

	public static char[] checkItReverse(char[] ch) {
		int i=0;
		int j = ch.length-1;
		while(i<j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		
		return ch;
	}
	
	public static void main(String[] args) {
		String s = "MADAM";
        char[] s1 = checkItReverse(s.toCharArray());
        String s2 = new String(s1);
        System.out.println(s2);
        
        if(s.equals(s2)) {
        	System.out.println("Palindrom");
        }else {
        	System.out.println("Not Palindrome");
        }
        
	}

}
