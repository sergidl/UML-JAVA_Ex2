public class Car extends Engine{
	private String color;
	private int maxSpeed;



	
	public Car(String color, int maxSpeed) {
		setColor(color);
		setMaxSpeed(maxSpeed);
	}


	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	


	public void CarInfo() {
		System.out.println("Color: " + getColor());
		System.out.println("Max Speed: " + getMaxSpeed());
	}

	
	
	@Override
	public void enginStart(String car) {
		System.out.println(car+": Engine started");
	}
	
	@Override
	public void enginStop(String car) {
		System.out.println(car+": Engine stopped");
	}
}
