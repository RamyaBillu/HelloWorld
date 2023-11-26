package explanationOnSuperThisNov_23;

class Pen {
	int value = 8;

	public Pen() {
		System.out.println("needed");
	}
	public Pen(int d) {
		System.out.println("I AM INTEGER");
		
	}

	public void m1() {
		System.out.println("this is method m1()");
	}

}

class Book extends Pen {
	public Book() {
		super(8);
		System.out.println("book must");
		super.m1();
		System.out.println(super.value);
	}

	public static void m2() {
		System.out.println("i am static method");
	}
}

public class SuperExplanation {

	public static void main(String[] args) {
		Book b = new Book();
		Book.m2();

	}

}
