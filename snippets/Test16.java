package snippets;

class Test16 {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = str1.intern();
		String str3 = new String("java");
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);

	}

}
