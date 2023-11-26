package oopsRevision_nov21;

public class Dog extends Animal {
	
	
	static String name = "jimmy";

	public void legs() {
		System.out.println("i have four legs");
	}

	public void name() {
		System.out.println("my dog name lilli");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.legs();
		dog.walk();// parent
		dog.eat();// parent
		System.out.println(Dog.name);
		Animal animal = new Dog();
		Dog d2 = (Dog) animal;
		d2.name();
		System.out.println(animal.name);
	}

}
