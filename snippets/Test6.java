package snippets;

class Test6 {

	public static void main(String[] args) {
		int[][] a = {{1,2}, {3,4}};
		int[] b = (int[])a[1];
		
		Object o1 = a;
		
		int[][] o2 =  (int[][])o1;
		System.out.println(b[1]);
		
		Object x = 1;
		Object ab = true;
		Object x1 = 3.45;
		
		x = "Mobin";
		
		System.out.println(x);

	}

}
