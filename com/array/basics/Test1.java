package com.array.basics;

import java.util.Arrays;

class Test1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int ele: arr) {
			System.out.print(ele + " ");
		}

		System.out.println();
		
		Arrays.fill(arr, 10);
		Arrays.fill(arr, 2, 4, 7);
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
		//Arrays.sort(arr); // imp
		//Arrays.binarySearch(arr, 10); // imp
		
		System.out.println();
		
		int[] a = {5,7, 8, 10, 25, 34, 60,85};
		//int index =  Arrays.binarySearch(a, 7);
		//int index = Arrays.binarySearch(a, 2);
		
		int index = Arrays.binarySearch(a, 15);
		
		System.out.println(index);
		
		
	}

}
