package oopsRevision_nov21;
class PuppyDog extends Dog{
	public void eat() {
		System.out.println("slowly crushing and eating");
	}
	public void walk() {
		System.out.println("cant walk fast");
	}
	
	
}

public class MultiLevel {

	public static void main(String[] args) {
       PuppyDog puppyDog=new PuppyDog();
       puppyDog.legs();
       puppyDog.walk();
       Dog dog=new Dog();
       dog.walk();
       Animal animal=new Animal();
       animal.walk();
	}

}
