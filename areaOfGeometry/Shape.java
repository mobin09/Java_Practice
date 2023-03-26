package areaOfGeometry;

abstract class Shape {
	 double area;
	 double length;
	 
	 abstract public void input();
	 abstract public void compute();
	 //abstract public void display();
	 
	 public void display() {
			System.out.println("Area of Shape is:" + String.format("%.2f", area));
		}
	 
	 
}
