package string;

class Test8 implements Cloneable {

	public static void main(String[] args) {
		// Copy one String into another String
		String str = "I am learning java full stack development";
		String str2 = "";
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			str2 += c;
		}

		System.out.println(str2);
		
	}

}
