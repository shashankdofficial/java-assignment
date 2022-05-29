package question2;

public class Parent {
	
	public int number;

	void method1(int number) {
		System.out.println("Inside method1 in Parent Class");
	}
	void method2() {
		System.out.println("Inside method2 in Parent Class");
	}
	void method3() {
		System.out.println("Inside method3 in Parent Class");
	}
	
	public Parent() {
		
	}
	public Parent(int number) {
		this.number = number;
	}
}
