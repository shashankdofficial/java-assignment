package question2;

public class Citizen {

	String name;
	String aadharNumber;
	String mobileNumber;
	
	
	
	public Citizen() {

	}



	public Citizen(String name, String aadharNumber, String mobileNumber) {
		this.name = name;
		this.aadharNumber = aadharNumber;
		this.mobileNumber = mobileNumber;
	}



	public void printDetails() {
		System.out.println("Name is: "+name);
		System.out.println("Mobile No. is: "+mobileNumber);
		System.out.println("Aadhaar No. is: "+aadharNumber);
	}
}
