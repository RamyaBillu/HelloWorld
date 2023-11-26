package exceptions_nov17;

public class NullPointerExceptionExample {

	public static void main(String[] args) {

		try {
			// Attempting to use a reference variable that is null
			String str = null;
			int length = str.length(); // This will throw a NullPointerException
			System.out.println("Length of the string: " + length); // This line won't be reached
		} catch (NullPointerException e) {
			// Catching and handling the NullPointerException
			System.out.println("Caught NullPointerException: " + e.getMessage());
		} finally {
			// Code in the finally block will be executed no matter what
			System.out.println("Finally block executed");
		}
	}
}
