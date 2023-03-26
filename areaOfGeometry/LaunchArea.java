package areaOfGeometry;

public class LaunchArea {

	 static boolean isAvailable(int x) {
		 return x-- > 0 ? true: false;
	 }
	
	public static void main(String[] args) {
		int x = 5;
		while(isAvailable(x)) {
			System.out.println(x--);
		}
		
		
		CallCulateArea area =new CallCulateArea();
		
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Square s = new Square();
		
		area.calulateShapeArea(s);
		area.calulateShapeArea(c);
		area.calulateShapeArea(r);
		
		
		
		
		
		
	}
}
