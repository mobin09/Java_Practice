package opps;

/**
 * Object and class ---------------- Class is the blueprint to create an Object
 * or template to create Objects Object is the instance of class
 * 
 * @author mobin
 *
 */

class Car {
	private String brandName;
	private double price;
	private boolean isAutomated;
	private int speed;
	private int seats;

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setAutomated(boolean isAutomated) {
		this.isAutomated = isAutomated;
	}

	public boolean getAutomated() {
		return isAutomated;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getSeats() {
		return seats;
	}

	public void breakTheCar() {
		if (speed >= 20) {
			speed = speed - 10;
		} else {
			speed = 0;
		}
	}

	public String leftIndecator() {
		return "Turning Left";
	}

	public String rightIndecator() {
		return "Turning Right";
	}

	public void accelerate(int speed) {
		this.speed += speed;
	}

	public String playMusic() {
		return "Music is Playing";
	}

	public String toString() {
		return "THe Description of the CAR\n" + "Brnad Name:" + this.brandName + "\n" + "Price:" + this.price + "\n"
				+ "Automated:" + this.isAutomated + "\n" + "Seats:" + this.seats;
	}
}

class Test0 {

	public static void main(String[] args) {
		Car verna = new Car();
        verna.setPrice(100000.0);
        verna.setAutomated(true);
        verna.setSeats(5);
        verna.setBrandName("Hyndai-Verna");
        
        System.out.println(verna);
        
	}

}
