package exceptions_nov17;

public class HandlingArithmetic {

	public static void main(String[] args) {
		try {
			int value = 100 / 0;
		}
		// catch(Exception e) {
		catch (ArithmeticException a) {
			System.out.println("it is arithmetic leave it");
			a.printStackTrace();
		}

	}
}
