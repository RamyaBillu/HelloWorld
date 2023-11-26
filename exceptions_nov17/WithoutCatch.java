package exceptions_nov17;

public class WithoutCatch {

	public static void main(String[] args) {
		String[] s = { "ram", "anshu" };
		try {
			String value = s[2];
		} finally {

			System.out.println("string index out of bounds exception");

		}

	}

}
