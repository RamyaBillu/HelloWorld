package exceptions_nov17;

public class MultipleTryCatchFinallySameMethod {
	public static void main(String[] args) {
		handleMultipleExceptions();
	}

	private static void handleMultipleExceptions() {
		try {
			// First try block
			int result = divide(10, 0);
			System.out.println("Result: " + result); // This line won't be reached
		} catch (ArithmeticException e) {
			// Handle ArithmeticException
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		} finally {
			// Code in the first finally block will be executed no matter what
			System.out.println("First Finally block executed");
		}

		try {
			// Second try block
			int[] array = { 1, 2, 3 };
			int value = array[10]; // Accessing an index that doesn't exist
			System.out.println("Value: " + value); // This line won't be reached
		} catch (ArrayIndexOutOfBoundsException e) {
			// Handle ArrayIndexOutOfBoundsException
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} finally {
			// Code in the second finally block will be executed no matter what
			System.out.println("Second Finally block executed");
		}
	}

	// A method that may throw exceptions
	private static int divide(int numerator, int denominator) {
		return numerator / denominator;
	}
}
