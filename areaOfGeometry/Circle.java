package areaOfGeometry;

import java.util.Scanner;

class Circle  extends Shape{
	
	private final double pi = Math.PI;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Radius of the Circle");
		length = sc.nextDouble();
	}

	public void compute() {
		area = pi * length * length;
	}

}
