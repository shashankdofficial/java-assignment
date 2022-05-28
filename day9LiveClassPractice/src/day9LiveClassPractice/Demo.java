package day9LiveClassPractice;

public class Demo extends A{
	
	@Override
	void funcX() {
		System.out.println("inside funcX in class Demo");
	}
	
	//We can create our own method here also
	void funcD() {
		System.out.println("Inside FuncD in Demo Class");
	}
	
	public static void main(String[] args) {
		A a1 = new Demo();
		
		//here it will call overridden function
		a1.funcX(); //Up-casting
		
		//here we can not call wit a1 to the child class method
		//So to do That we have 2 option
		//Either we create a object of child class (Demo) object
		
		//Demo d1 = new Demo();
		
		//but why to create another when we already created in a1
		//so for that we down-cast the a1
		
		Demo d1 = (Demo)a1;
		
		d1.funcD();
		
	}

}
