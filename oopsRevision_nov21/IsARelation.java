package oopsRevision_nov21;

class Human {
	public void action() {
		System.out.println("speak,think,implement");
	}
}

class Collector extends Human {
	public void action() {
		System.out.println("government authority");
	}
}

public class IsARelation {

	public static void main(String[] args) {
		Human human = new Collector();
		human.action();
	}
	}
