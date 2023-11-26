package explanationOnSuperThisNov_23;

class Pen1 {
	int value = 8;

	public Pen1() {
		System.out.println("needed");
	}

	public Pen1(int d) {
		System.out.println("I AM INTEGER");

	}

	public void m1() {
		System.out.println("this is method m1()");
	}

}

class Bag {
	public Bag() {
		System.out.println("degfault bag");
	}
}

//class Book extends Pen1,Bag {//diamond problem
//	public Book() {
//		super(8);
//		System.out.println("book must");
//		super.m1();
//		System.out.println(super.value);
//	}

public class Diamond {

	public static void main(String[] args) {

	}

}
