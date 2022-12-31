package basics01;

public class Incr_Decr {

	public static void main(String[] args) {
		System.out.println("Hello Wolrd");;;;;;;
		//int a = 5;
		//a++;
		//System.out.println(a);
		//int y = 10;
		//y = a++;// post increment the value
		//System.out.println(y);
		//System.out.println(a);
       //int b = 10;
       //int z;
       // z = ++b; // pre-increment happens here
       //System.out.println(z);
       //System.out.println(b);
	  int a = 5;
	  int b;
	  //b = a++ + a++ + ++a;
	  //b = ++a + a++ + ++a + a--;
	  b = a++ + --a - a-- - a++;
	  System.out.println(a);
	  System.out.println(b);;;;;;;;;;;;
		
		
		
		
	}

}
