package question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Passengers : ");
		c1.setNumberOfPassengers(sc.nextInt());
		System.out.println("Enter No. of KMs : ");
		c1.setNumberOfKms(sc.nextInt());
		
		//Write logic to get numberOfPassenger and numberOfKms

		Ola myOla = new Ola();
		Car myCar = myOla.bookCar(c1.getNumberOfPassengers(), c1.getNumberOfKms());
		int res = myOla.calculateBill(c1);

		System.out.println("The total fare amount is "+ res);
		
		sc.close();

	}

}