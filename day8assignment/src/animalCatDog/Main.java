package animalCatDog;

public class Main {

	public static void main(String[] args) {
		Animal[] arr =  new Animal[3];
		
		arr[0] = new Dog();
		arr[1] = new Cat();
		arr[2] = new Tiger();
		
		arr[0].eat();
		arr[0].makeNoise();
		arr[0].walk();
		
		arr[1].eat();
		arr[1].makeNoise();
		arr[1].walk();
		
		arr[2].eat();
		arr[2].makeNoise();
		arr[2].walk();
	}
}
