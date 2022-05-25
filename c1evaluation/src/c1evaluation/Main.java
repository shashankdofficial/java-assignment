package c1evaluation;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Car Model: ");
		String model = s.next();
		
		System.out.println("Enter Company Name: ");
		String companyName = s.next();
		
		System.out.println("Enter Color: ");
		String Color = s.next();
		
		System.out.println("Enter RPM: ");
		int rpm = s.nextInt();
		
		System.out.println("Enter Power");
		int power = s.nextInt();
		
		System.out.println("Enter manufacturer");
		String manufacturer = s.next();
		
		Car c = new Car(model, companyName, Color);
		c.showCarClassDetails();
		
		Engine e = new Engine(rpm, power, manufacturer);
		e.showEngineClassDetails();
		e.Turbo();
		
		s.close();
	}
}
