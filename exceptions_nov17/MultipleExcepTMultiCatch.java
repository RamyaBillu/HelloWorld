package exceptions_nov17;

public class MultipleExcepTMultiCatch {

	public static void main(String[] args) {
		try {
			// Code that may throw exceptions
			int result = divide(10, 0);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			// Handle ArithmeticException
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			// Handle ArrayIndexOutOfBoundsException
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (Exception e) {
			// Handle other exceptions
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
		} catch (ArithmeticException e) {
			// Handle ArithmeticException
			System.out.println("Caught ArithmeticException inside divide ");

		}
		return 0;
	}
}
