package question1;

public interface Y {

	abstract void funA();
	
	default void funB() {
		System.out.println("inside funB of Y interface");
	}
	
	static void funC() {
		System.out.println("inside funC of Y interface");
	}
}
