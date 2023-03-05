package string;


class Test {

	public static void main(String[] args) {
	    String s1 = new String("You can not change me");
	    String s2 = new String("You can not change me");
	    System.out.println(s1 == s2);
	    
	    String s3 = "You can not change me";
	    System.out.println(s1 == s3);
	    
	    String s4 = "You can not change me";
	    System.out.println(s3 == s4);
	    
	    String s5 = "You can not " + "change me";
	    System.out.println(s3 == s5);
	    
	    String s6 = "You can not ";
	    String s7 = s6+"change me";	    
	    System.out.println(s3 == s7);
	    
	    final String s8 = "You can not ";
	    String s9 = s8 +"change me";	    
	    System.out.println(s3 == s9);
	    
	    System.out.println(s6 == s8);
	    
	    
  
	}

}
