package conditionFlow_nov10;

public class NonPrimeDoWhile {
	public static void main(String[] args) {
		int number = 1;

		do {
			if (!isPrime(number)) {
				System.out.print(number + " ");
			}
			number++;
		}

		while (number <= 100);
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
