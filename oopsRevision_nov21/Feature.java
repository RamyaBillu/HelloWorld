package oopsRevision_nov21;

class Trait implements Abstraction {

	@Override
	public void hide() {
		System.out.println("by birth we get");
	}

}

public class Feature implements Abstraction {

	@Override
	public void hide() {
		System.out.println("internal");
	}

	public static void main(String[] args) {
		Abstraction abstraction = new Trait();
		abstraction.hide();
		Abstraction abstraction1 = new Feature();
		abstraction1.hide();

	}

}
