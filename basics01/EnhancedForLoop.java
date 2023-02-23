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
         
         int[][][] elements = {{{10, 30,40}, {50, 60}, {5,1},{100}}};
         for(int[][] x: elements) {
        	 for(int[] b:x) {
        		 for(int c:b) {
        			 System.out.print(c+" ");
        		 }
        		 
        		 System.out.println();
        		 
        	 }
         }
 
     // find every alernative lements
         for(int i=0; i<arr.length; i+=2) {
        	 System.out.println(arr[i]);
         }
         
         int []dx[] = {{1,2,3,4}}; // valid
         int[] ad = new int['a'];
         
         // write a program to get sum of all arrays
         
         int sum = 0;
         for(int i=0; i<arr.length; i++) {
        	 sum += arr[i];
         }
         
         System.out.println("SUM is: "+ sum);
         
         
         // write a program to get minimum and maximum value of array;
         
         int min = arr[0];
         int max = arr[0];
         
         for(int i=0; i<arr.length; i++) {
        	 if(min > arr[i]) {
        		 min = arr[i];
        	 }
        	 
        	 if(max < arr[i]) {
        		 max = arr[i];
        	 }
        	 
         }
         
         System.out.println("MIN: "+ min +" MAX: "+ max);
         
         
         
         
         
	}

}
