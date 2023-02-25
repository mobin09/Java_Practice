package snippets;

class Test1 {

	public static void main(String[] args) {
		int x = 10;
	     l1: {
			System.out.println("Begin");
			if(x == 10) {
				break l1;
			}
			
			System.out.println("End");
			
		}
	     
	    System.out.println("Hello"); 
	     

	}

}
