package string;

/**
 * Anagram e.g bat, tab
 * 
 * @author mobin
 *
 */

class Test12 {

	public static void main(String[] args) {
		String s1 = "race";
		String s2 = "care";
		boolean isPresent = true;
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);

			if (!s1.contains(String.valueOf(ch))) {
				isPresent = false;
				break;
			}

		}

		if (isPresent) {
			System.out.println("It is Anagram");
		} else {
			System.out.println("It is not Anagram");
		}
	}

}
