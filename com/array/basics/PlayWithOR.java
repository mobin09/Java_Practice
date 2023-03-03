package com.array.basics;

/*
You are given an array arr[], you have to re-construct an array arr[].
The values in arr[] are obtained by doing OR(bitwise or) 
of consecutive elements in the array.
*/

// BitWise OR operator

public class PlayWithOR {

	public static void main(String[] args) {
		int[] arr = {10, 11, 1, 2, 3};
        for(int i=0; i<arr.length-1; i++) {
        	arr[i] = arr[i] | arr[i+1];
        }
        
        for(int x: arr) {
        	System.out.print(x+" ");
        }
        
	}

}
