package oopsRevision_nov21;

// Class representing an Address
class Address {
	private String street;
	private String city;

	// Constructor
	public Address(String street, String city) {
		this.street = street;
		this.city = city;

	}

	
	@Override
	public String toString() {
		return street + ", " + city;
	}
}

class Person {
	private String name;
	private int age;
	private Address address; // "has-a" relationship

	// Constructor
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nAddress: " + address;
	}
}

public class RelationHas {

	public static void main(String[] args) {
		// Creating an Address object
		Address address = new Address("123 Main St", "bangkok");

		// Creating a Person object with the Address object
		Person person = new Person("John Doe", 25, address);

		// Displaying person details
		System.out.println(person);
	}
}
