package basics01;

public class EnhancedForLoop {

	public static void main(String[] args) {
		 int[] arr = {10, 20, 40, 50};
		 
		 // 1D array access
		 for(int i: arr) {
			 System.out.print(i+ " ");
		 }
		 System.out.println();
		 int[][] a = {{20, 30, 40}, {50, 60,70}};
         for(int[] x: a) {
        	 for(int d: x) {
        		 System.out.print(d+" ");
        	 }
        	 
        	 System.out.println();
         }		 
 
	}

}
