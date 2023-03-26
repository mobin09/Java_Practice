package areaOfGeometry;
import java.util.Scanner;

class Rectangle extends Shape{
    
     private double width;
    

	public double getWidth() {
		return width;
	}
  
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Length and Breadth of Rectangle");
		length = sc.nextDouble();
		width = sc.nextDouble();
	}
	
    public void compute() {
    	 area = length * width; 
    } 
    
}
