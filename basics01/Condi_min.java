package basics01;

public class Condi_min {

	
	static int findMin(int a, int b, int c) {
		if(a >= b &&  b <=c) {
			return b;
		}else if(b >= a && a <= c) {
			return a;
		}else if(a >= c && c<= b) {
			return c;
		}
		
		return 0;
		
	}
	
	
	static int findM(int a, int b, int c) {
		int x = Math.min(a, b);
		int y = Math.min(x, c);
		return y;
	}
	
	
	
	public static void main(String[] args) {
		  int min = findM(4,4,4);
          System.out.println(min);
		int x = Math.min(0, 0);
		System.out.println(x);
	}

}
