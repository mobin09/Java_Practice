package string;

class Test7 {

	public static void main(String[] args) {
		// Method Chaining : If the return type of methods are same then we apply method
		// chaining
		String name = "Mobin";
		name = name.toUpperCase();
		int count = name.length();
		System.out.println(count);
       
		// Method chaining
		
		System.out.println(name.toUpperCase().length());
		StringBuffer sb = new StringBuffer("Abcd");
		sb.append("XYZ").reverse().insert(1, "ADD");
		
		System.out.println(sb);
		

	}

}
