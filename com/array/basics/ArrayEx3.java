package com.array.basics;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();

		int[][] arr = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		sc.close();

		for (int[] ar : arr) {
			for (int x : ar) {
				System.out.print(x + " ");
			}
			System.out.println();
		}

	}

}
