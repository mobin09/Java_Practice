package com.array.basics;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {10, 30, 50, 60,80};
		// find 60
		
		int data = 60;
		boolean isPresent = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == data) {
				System.out.println("Present: " + data);
				isPresent = true;
				break;
			}
		}
		
		if(isPresent) {
			System.out.println("Element is present");
		}else {
			System.out.println("Element is not present");
		}
		
		
		
		

	}

}
