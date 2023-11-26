package interfaceAbstract_nov16;

// Parent interface
interface Parent {
	void parentMethod();
}

// Child interface extending the Parent interface
interface Child extends Parent {
	void childMethod();
}

// Concrete class implementing the Child interface
class MyClass implements Child {
	@Override
	public void parentMethod() {
		System.out.println("Implementation of parentMethod in MyClass");
	}

	@Override
	public void childMethod() {
		System.out.println("Implementation of childMethod in MyClass");
	}
}

public class Main {
	public static void main(String[] args) {
		// Creating an instance of MyClass
		MyClass myObject = new MyClass();

		// Calling methods through the interface reference
		myObject.parentMethod();
		myObject.childMethod();
	}
}
