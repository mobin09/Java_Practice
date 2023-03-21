package snippets;

class SpecialString{
	String str;
	SpecialString(String str){
		this.str = str;
	}
	
//	public String toString() {
//		return str;
//	}
	
}

class Test13 {
	public static void main(String[] args) {
		Object[] arr = new Object[4];
		for(int i=1; i<=3; i++) {
			switch(i) {
			case 1:
				arr[i] = new String("Java");
				break;
			case 2:
				arr[i] = new StringBuilder("Java");
				break;
			case 3:
				arr[i] = new SpecialString("Java");
				break;
			}
		}
		
		for(Object o: arr) {
			System.out.println(o);
		}
		
		String a = "M";
		System.out.println(a.repeat(5));
		
		
		System.out.println("   Mobin Arshad  ".trim());
		System.out.println("    Mobin Arshad Khna    ".strip());
		
		System.out.println("mobin".toUpperCase() == "MOBIN");
		
		String str = "   ";
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		
		String ab = "Mobin Arshad Khan";
		System.out.println(ab.substring(8, 4));
		
		
		
		
		
	}

}
