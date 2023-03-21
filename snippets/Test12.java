package snippets;

class Abcd{
	public String toString() {
		return null;
	}
}

class Test12 {

	public static void main(String[] args) {
		String test = null;
		
		test = test + new Abcd();
		System.out.println(test.length());
		
		String x  = null + "null";
		System.out.println(x);

	}

}
