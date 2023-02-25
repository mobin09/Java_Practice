package com.array.basics;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {7, 5, 2, 1, 4, 1, 2, -1};
        
		for(int i=0; i< arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
				
			}
			
		}
		
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
		
		
	}

}
