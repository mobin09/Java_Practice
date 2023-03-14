package opps;

/**
 * Constructor is mainly used to initialized the Objects
 * 
 * @author Mobin
 *
 */

class Pen {
	private String color;
	private double price;

	Pen(String color, double price) {
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

}

public class LaunchPen {

	public static void main(String[] args) {
		Pen p1 = new Pen("Red", 10.5);
		Pen p2 = new Pen("Blue", 7.0);
		Pen p3 = new Pen("Black", 5);
		Pen p4 = new Pen("Green", 10.5);
		Pen[] pens = new Pen[4];
		pens[0] = p1;
		pens[1] = p2;
		pens[2] = p3;
		pens[3] = p4;

		for (Pen p : pens) {
			String col = p.getColor();
			double price = p.getPrice();

			System.out.println("Color:" + col + " - Price:" + price);

		}

	}

}
