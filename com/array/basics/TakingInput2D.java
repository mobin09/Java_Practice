package com.array.basics;

import java.util.Scanner;

public class TakingInput2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the no. of class");
		int cls = sc.nextInt();
		System.out.println("Please enter the no. of students int Each class");
		int stds  = sc.nextInt();
		int[][] arr = new int[cls][stds];
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		
		System.out.println("Display the Students");
		
		for(int[] st: arr) {
		    for(int x: st) {
		    	System.out.print(x+" ");
		    }
		    System.out.println();
		}
		
		

	}

}
