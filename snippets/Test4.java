package snippets;

// Snippet 4
class Test4 {

	public static void main(String[] args) {
		int a = 7;
		boolean res = a++ == 7 && ++a == 9 || a++ == 9;
        System.out.println("a:"+ a);
        System.out.println("res:"+ res);
//Snippet 5        
        
        int x = 9;
        if(x++ <10) {
        	System.out.println("true"+ x);
        }else {
        	System.out.println("false"+ x);
        }
// Snippet 6        
       int num = 5;
       do {
    	   System.out.println(num-- +" ");
       }while(num ==0);
      
      int y;
      
       
       
        		
	}

}
