package string;

  class Test9 {

	public static void main(String[] args) {
		// Write a program to convert upperCase to lowerCase and vice versa
		String name = "MobinArshad#$%#";
		System.out.println((int)'A'+" "+ (int)'a' +" " + (int)'Z' + " " + (int) 'z');
		String str = "";
		for(int i=0; i<name.length(); i++) {
			char x = name.charAt(i);
			char z = x;
			if(x>= 65 && x<= 90) {
				// this is upper case convert to lower case 
				// convert to lower case
				
				 z= (char)(x + 32);
				
				
			}else if(x >= 97 && x<= 122) {
				// this is lower case 
				// convert to upper case
				
				 z=  (char) (x- 32);
				
			}else {
				z= (char) x;
			}
			
			str += z;
			
		}
		
		System.out.println(str);
		
		
		
	}

}
