package basics01;

public class SwapTwoWithoutThird {

	public static void main(String[] args) {
		// swapping two number without using third variables
		
		int a = 10;
		int b = 20;
		b = a+b-b;
		a = a+b;
		
		System.out.println(a+ " " + b);

	}

}
