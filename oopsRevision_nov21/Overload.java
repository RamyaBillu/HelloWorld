package oopsRevision_nov21;

public class Overload {
	 int value=10;
	public void add(int a, int b) {
		int result = a + b;
		System.out.println(result);

	}

	public void add(float a, float b) {
		double result = a + b;
		System.out.println(result);

	}

	public static void main(String[] args) {
		Overload overload = new Overload();
		overload.add(10.4f, 3.5f);
		overload.add(10, 4);
		System.out.println(overload.value);

	}

}
