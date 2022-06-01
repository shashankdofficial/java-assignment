package question3;

public class AbstractNdInterface {

	public static void main(String[] args) {
		//for abstract class we have to create their child for implementations.
		//for inheritance we use "extends".
		//If we create an abstract class we can't create their object directly.
		ChildAbstract child = new ChildAbstract();
		child.print();
		
		//by the interface we achieve 100% abstraction in java.
		//for inheritance we use "implements".
		//an interface contains only abstract methods and constant variables .
		ChildInterface intr = new ChildInterface();
		intr.example();
	}
}
