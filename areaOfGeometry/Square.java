package areaOfGeometry;

import java.util.Scanner;

class Square extends Shape {

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of  Square");
		length = sc.nextDouble();
	}

	public void compute() {
		area = length * length;
	}

}
