package question1;

public interface X {

	abstract void funX();
	
	default void funY() {
		System.out.println("inside funY of X interface");
	}
	
	static void funZ() {
		System.out.println("inside funZ of X interface");
	}
}
