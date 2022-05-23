package c1evaluation;

public class Car {
	private String model;
	private String companyName;
	private String Color;
	
	public Car(String model, String companyName, String Color) {
		this.model = model;
		this.companyName = companyName;
		this.Color = Color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setColor(String Color) {
		this.Color = Color;
	}
	public String getColor() {
		return Color;
	}
	public void showCarClassDetails() {
		System.out.println("Car Model : "+model);
		System.out.println("Car CompanyName : "+companyName);
		System.out.println("Car Color : "+Color);
	}
}
