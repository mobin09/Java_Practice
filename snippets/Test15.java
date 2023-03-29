package snippets;

public class Test15 {

	public static void main(String[] args) {
		final int i1 = 1;
		final Integer i2 = 1;
		final String s1 = ":ONE";
		
		String str1 = i1 + s1;
		String str2 = i2 + s1;
		
		System.out.println(str1 == "1:ONE");
		System.out.println(str1 == str2);
		
		String str3 = "javaWorld";
		String java = "java";
		java +="World";	
		System.out.println(str3 == java);	
		
		String s4 = "ABCD";
		System.out.println(s4.equals("abcd".toUpperCase()));
		
	}
}
