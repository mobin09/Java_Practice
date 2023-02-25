package snippets;

class Test2 {

	public static void main(String[] args) {
		l1:for(int i=1; i<5; i++) {
			l2:for(int j=1; j<5; j++) {
				l3:for(int k=1; k<5; k++) {
					System.out.println("Hello");
					 if(k==2) {
						 break l1;
					 }
				}
			}
		}
		
		if(true) {
			System.out.println("Hello");
		}else {
			System.out.println("Hii");
		}
		
	}

}
