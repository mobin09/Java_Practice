package string;

// String important methods
/**
 * equals()
 * equalsIgnoreCase()
 * substring(int start, int end)
 * substring(int start)
 * replace(char old, char new)
 * replaceAll(String regex, String replacement)
 * replaceFirst(String regex, String replacement)
 * toUpperCase()
 * toLowerCase()
 * 
 */

class Test4 {

	public static void main(String[] args) {
		String s = "java";
		System.out.println(s.equals("JAVA"));
		System.out.println(s.equalsIgnoreCase("JAVA"));
		
		String x = "Mobin Arshad";
		String n = x.substring(0, 5);
		System.out.println(n);
		
		String m = x.substring(6);
		System.out.println(m);
		
		String str = "Abcd helllo xyz helllo";
		String str1 = str.replaceAll("helllo", "hello"); 
		System.out.println(str1);
		
		String str2 = "My name isa Mobin Arshad Khan, isa";
		String str3 = str2.replaceFirst("isa", "is");
		System.out.println(str3);
		String name = "Mobin Arshad";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

	}

}
