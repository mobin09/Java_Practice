package snippets;

class Test14 {

	static boolean isAvailable(int x) {
		return x-- > 0 ? true : false;
	}

	public static void main(String[] args) {
		int x = 5;
		while (isAvailable(x)) {
			System.out.println(x--);
		}
		
		StringBuilder sb = new StringBuilder("Java");
		String s1 = sb.toString();
		String s2 = "Java";
		System.out.println(s1 == s2);
		
		
	}

}
