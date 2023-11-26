package throwThrows_nov20;

import java.util.Scanner;

class UserDefinedException extends Exception {
	public UserDefinedException(String message) {
		super(message);
	}
}

public class UserDefinedTryInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int value = scanner.nextInt();
		try {

			if (value < 10) {
				throw new UserDefinedException("Value is less than 10");
			}

			// Rest of the code in the try block
			System.out.println("This line will be executed if the condition is false");
		} catch (UserDefinedException e) {
			// Handle the user-defined exception
			System.out.println("Caught an exception: " + e.getMessage());
		} finally {
			// Code in this block will be executed regardless of whether an exception is
			// thrown or not
			System.out.println("Finally block executed");
		}
	}
}
