package basics01;

public class Condi_min {

	static int findMin(int a, int b, int c) {
		if (a >= b && b <= c) {
			return b;
		} else if (b >= a && a <= c) {
			return a;
		} else if (a >= c && c <= b) {
			return c;
		}

		return 0;

	}

	static int findM(int a, int b, int c) {
		int x = Math.min(a, b);
		int y = Math.min(x, c);
		return y;
	}

	static int findmin(int a, int b, int c) {
		if (a < b) {
			if (a < c) {
				return a;
			} else {
				return c;
			}

		} else if (b < a) {
			return b;

		} else {
			return c;
		}

	}

	public static void main(String[] args) {
//		  int min = findM(4,4,4);
//          System.out.println(min);
//		  int x = Math.min(0, 0);
//		  System.out.println(x);
// Ternary Operator
		int a = 20;
		int b = 10;
		int c = a>b?a:b;
		System.out.println(c);
		
		
	}

}
