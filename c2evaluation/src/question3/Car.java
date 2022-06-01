package question3;

public class Car {
	
	private int numberOfPassengers;
	private int numberOfKms;
	
	public Car() {
	}
	
	
	
	public Car(int numberOfPassengers, int numberOfKms) {
		super();
		this.numberOfPassengers = numberOfPassengers;
		this.numberOfKms = numberOfKms;
	}



	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}	
	

}

class Sedan extends Car{
	
	final int farePerKm = 20;
	
}

class HatchBack extends Car{
	
	final int farePerKm = 15;
}

class Ola {
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		Sedan sd = new Sedan();
		HatchBack hb = new HatchBack();
		
		if(numberOfPassenger <= 3) {
			return hb;
		}
		else {
			return sd;
		}		
	}
	
	public int calculateBill(Car car) {
		
//		Car c1 = new Car();
		
		int totalFare = car.getNumberOfKms() * car.getNumberOfPassengers();	
		
		return totalFare;
	}
	
	
}
