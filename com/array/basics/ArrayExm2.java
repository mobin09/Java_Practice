package com.array.basics;

public class ArrayExm2 {

	public static void main(String[] args) {
		// store the 4 marks for student of 3 class
		
		int[][] marks = new int[3][4];
		marks[0][0] = 10;
		marks[0][1] = 20;
		marks[0][2] = 40;
		marks[0][3] = 50;
		marks[1][0] = 80;
		marks[1][1] = 85;
		marks[1][2] = 90;
		marks[1][3] = 87;
		marks[2][0] = 87;
		marks[2][1] = 90;
		marks[2][2] = 68;
		marks[2][3] = 40;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		
		while(true);
		
		
	}

}
