package classCastException;

public class Main {

	
	//Class Cast Exception occur when we try to make the object of parent class in child class variable.
	//We can create child class inside the parent but not parent in child
	public static void main(String[] args) {

		//     B b1 = new A();
		
		//If we write
		A a1 = new B();
		//so this is possible 
		a1.funA();
	}

}
