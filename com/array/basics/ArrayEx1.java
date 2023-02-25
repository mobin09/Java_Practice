package com.array.basics;

import java.util.*;

public class ArrayEx1 {

	public static void main(String[] args) {
		// Store marks of student for 10 subjects
		// declaring the array and assigning the value to it
		
		int[] subjects = new int[10];
		subjects[0] = 88;
		subjects[1] = 65;
		subjects[2] = 70;
		subjects[3]  = 65;
		subjects[4] = 81;
		subjects[5] = 75;
		subjects[6] = 81;
		subjects[7] = 62;
		subjects[8] = 100;
		subjects[9] = 92;
		
		System.out.println(subjects[6]); // accessing the value of the array
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		System.out.println(arr);
        arr.set(0, 5);
		System.out.println(arr);
		
		ArrayList<Integer> a = new ArrayList();
		a.add(9);
		a.add(8);
		
		a = arr;
		System.out.println(a);
		
		int[] abc = {10, 50, 6, 7};
		ArrayList ab = (ArrayList) Arrays.asList(abc);
		
		System.out.println(ab);
		
	}

}
