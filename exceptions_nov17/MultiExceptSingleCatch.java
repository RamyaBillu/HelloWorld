package exceptions_nov17;

public class MultiExceptSingleCatch {
	public static void main(String[] args) {
		try {
			// Code that may throw exceptions
			int result = divide(10, 0);
			System.out.println("Result: " + result);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// Handle both ArithmeticException and ArrayIndexOutOfBoundsException
			System.out.println("Caught Exception: " + e.getMessage());
		} finally {
			// Code in the finally block will be executed no matter what
			System.out.println("Finally block executed");
		}
	}

	// A method that may throw exceptions
	private static int divide(int numerator, int denominator) {
		int[] array = { 1, 2, 3 };

		try {
			// Code that may throw exceptions
			int result = numerator / denominator;
			int value = array[10]; // Accessing an index that doesn't exist
			return result;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("handled");

		}
		return 0;
	}
}
