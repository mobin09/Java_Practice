package snippets;


class Fiz{
	int x = 5;
	
}

 class Test8 {
     
	 
	public static void main(String[] args) {
	   final Fiz f1 = new Fiz();
	   Fiz f2 = new Fiz();
       Fiz f3 = switchFiz(f1, f2);
	   System.out.println((f1 == f3) + " : " + (f1.x == f3.x));
       
	   System.out.println(22 % 2.0);
	   System.out.println("Output is " + (22 != 5));
	}
	
	static Fiz switchFiz(Fiz x, Fiz y) {
		final Fiz z = x;
		z.x = 6;
		return z;
	}
	
	
	
	
	

}
