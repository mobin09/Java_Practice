package com.array.basics;


class Fan{
	String brand;
	double cost;
	String color;
}

public class ArrObject {

	public static void main(String[] args) {
		int[] a = new int[] {3,4,5};
		int[] b = {3,4,6};
		Fan[] f = new Fan[3];
		f[0] = new Fan();
		f[1] = new Fan();
		f[2] = new Fan();
		
		f[0].brand = "Abcd";
		f[1].brand = "Xyz";
		f[2].brand = "Mno";

		for(Fan x: f) {
			System.out.println(x.brand);
		}
		
	}

}
