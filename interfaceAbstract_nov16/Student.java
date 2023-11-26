package interfaceAbstract_nov16;

public interface Student {
	int value = 8;

	void calculate(int num1, int num2);

	private void bag() {
		System.out.println("i have bag ");

	}

	public static void books() {
		System.out.println("i have books ");
	}

	default void pens() {
		System.out.println("i have pens also");
	}

	// it will not allow protected
	// protected static void lunch() {
	// System.out.println("i have books ");
	// }
	public static void main(String[] args) {
		// we cannot
		// Student student=new Student();
	}

	public void parents();
	// it cannot
	// private abstract void friends();
	// protected void mentors();

}
