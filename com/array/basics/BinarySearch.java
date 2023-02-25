package com.array.basics;

public class BinarySearch {

	static int findUsingBinary(int[] arr,int data) {
		 int low = 0;
		 int high = arr.length -1;
		 
		 while(low <= high) {
			 int mid = low + (high-low)/2;
			 
			 if(arr[mid] == data) {
				 return mid;
			 }
			 
			 else if(arr[mid] > data) {
				 high = mid-1;
			 }
			 
			 else {
				 low = mid+1;
			 }
			 
		 }
		 
		 return -1;
		 
		 
	}
	
	public static void main(String[] args) {
		int[] arr = {2 , 5, 6, 8, 9, 20, 25};
		int data = 25;
		
		int index =  findUsingBinary(arr, data);
       if(index != -1) {
    	   System.out.println("Data present at index:"+ index);
       }else {
    	   System.out.println("Data is not present in the array:" + index);
       }
	}

}
