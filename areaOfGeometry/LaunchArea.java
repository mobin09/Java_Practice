package areaOfGeometry;

public class LaunchArea {

	public static void main(String[] args) {

		CallCulateArea area = new CallCulateArea();

		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Square s = new Square();

		area.calulateShapeArea(s);
		area.calulateShapeArea(c);
		area.calulateShapeArea(r);

	}
}
