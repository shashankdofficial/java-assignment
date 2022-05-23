package c1evaluation;

public class Engine {
	private int rpm;
	private int power;
	private String manufacturer;
	boolean hasTurbo=false;
	
	public Engine(int rpm, int power, String manufacturer) {
		this.rpm = rpm;
		this.power = power;
		this.manufacturer = manufacturer;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	public int getModel() {
		return rpm;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getPower() {
		return power;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	void Turbo() {
		hasTurbo = true;
	}
	public void showEngineClassDetails() {
		System.out.println("Car RPM : "+rpm);
		System.out.println("Car Power : "+power);
		System.out.println("Car Engine Manufacturer : "+manufacturer);
		System.out.println("Car Has turbo : "+hasTurbo);
	}
}
