package string;


// check weather the data present in Heap or not
 class Test3 {

	public static void main(String[] args) {
		// Case 1.
		String s1 = new String("Mobin"); // Heap Data
		String s2 = s1.intern(); //search SCP data
		System.out.println(s1 == s2); // false 
		
		String s3 = "Mobin";

        System.out.println(s2 == s3);
        
        // Case 2.
        
        String s4 = new String("sachin");
        String s5 = s4.concat("IND");
        String s6 = s5.intern();
        String s7 = "sachinIND";
        
        System.out.println(s5 + " :s7: " + s5.hashCode());
        
        System.out.println(s6 +" :s6: " + s6.hashCode());
        
        
        System.out.println(s4 == s6);
        System.out.println(s5 == s6);
        System.out.println(s7 == s6);
        
        
        
        
        
		
	}

}
