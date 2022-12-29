package basics01;

public class Car {
    String brandName;
	String color;
	double price;
	int seater;
	boolean isAutomated;
	String fuelType;
	
	public void accelerate() {
		System.out.println("Car is accelearating");
	}
	
	public void breakDown() {
		System.out.println("Car is slowing down");
	}
	
	public void turnLeft() {
		System.out.println("Turn Left");
	}
	
	public void turnRight() {
		System.out.println("Turn Right");
	}
	
	public Car(String brandName, String color, double price, int seater, boolean isAutomated, String fuelType) {
		 this.brandName = brandName;
		 this.color = color;
		 this.price = price;
		 this.seater = seater;
		 this.isAutomated = isAutomated;
		 this.fuelType = fuelType;
	}
	
	
	public static void main(String[] args) {
	          Car toyota = new Car("Toyota", "Black", 250000.45, 7,true, "diesel");	
	          toyota.accelerate();
	          System.out.println(toyota.price);
	          System.out.println(toyota); // when ever we try to prints the objects it internally calls the
	          // toString method if it present otherwise it prints its reference

	}

}
