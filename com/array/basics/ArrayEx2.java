package com.array.basics;

import java.util.Arrays;

public class ArrayEx2 {
// copying of array
	public static void main(String[] args) {
		int[] arr = { 10, 3, 25 };
		int[] num = arr;
		arr[1] = 15;
		System.out.println(num[1]);

		int[] arr2 = { 10, 20, 30 };
		int[] num2 = Arrays.copyOf(arr2, arr2.length);

		arr2[2] = 0;

		for (int n : num2) {
			System.out.print(n + " ");
		}

		int[] arr3 = { 15, 30, 45 };
		int[] num3 = new int[arr3.length];
		for (int i = 0; i < arr3.length; i++) {
			num3[i] = arr3[i];
		}

	}

}
