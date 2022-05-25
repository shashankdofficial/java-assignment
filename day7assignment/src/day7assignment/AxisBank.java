package day7assignment;

public class AxisBank extends Bank {

	double rateOfInterest;

	@Override
	void displayDetails() {

		System.out.println("Bank Name is : " + this.branchName);
		System.out.println("Bank IFSC is : " + this.ifscCode);
		System.out.println("Bank gives Interest rate of: " + this.rateOfInterest);

	}

	void getCreditCard() {

		System.out.println("Get the Credit Card from the Axis bank");

	}
}
