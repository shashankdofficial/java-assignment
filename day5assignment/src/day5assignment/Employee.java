package day5assignment;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	private int pfpercentage;
	
	public Employee(int employeeId,String employeeName,double salary,int pfpercentage){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.pfpercentage = pfpercentage;
	}
	public void calculateNetSalary(int pfpercentage) {
   	 double pf = (this.salary*this.pfpercentage)/100;
   	 
   	 double netSalary = this.salary-pf;
   	 this.netSalary = netSalary;
    }
	
	public void setEmplyeeId(int employeeID) {
		this.employeeId = employeeId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmplyeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	
	public void showDetails(){
		System.out.println("Employee Id is :"+employeeId);
		System.out.println("Employe Name is :"+employeeName);
		System.out.println("Employee Salary is :"+salary);
		System.out.println("Employee Net Salary is :"+netSalary);
	}
}
