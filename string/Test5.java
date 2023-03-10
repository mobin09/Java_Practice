package string;

class Test5 {

	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer("Mobin");
		sb.append(" Arshad");
		System.out.println(sb.toString());
		
		//sb = new StringBuffer("Abcd"); // here we will get compile time issues 
		
		int[] a = new int[2];
		a[0] = 1;
		a[1] = 5;
		
		int[] b = new int[3];
		
		a = b;
		
		for(int x: a) {
			System.out.println(x);
		}
		
		String[] s = new String[2];
		for(int i=0; i<s.length; i++) {
			//s[i].concat("Abcd"); // null pointer exception null.concat("Mobin");
		}
		
		

	}

}
