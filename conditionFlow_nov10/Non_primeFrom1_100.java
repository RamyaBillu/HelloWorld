package conditionFlow_nov10;

public class Non_primeFrom1_100 {

	public static void main(String[] args) {
		int lowRange = 1;
		int highRange = 100;
		for (int i = lowRange; i <= highRange; i++) {
			if (i == 1)
				System.out.println(i);

			if (!isPrime(i))
				System.out.println(i);
		}
	}

	public static boolean isPrime(int i) {
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;

	}
	

}
