package conditionFlow_nov10;

public class NonPrimeWhile {
	    public static void main(String[] args) {
	        int number = 1;

	        while (number <= 100) {
	            if (!isPrime(number)) {
	                System.out.print(number + " ");
	            }
	            number++;
	        }
	    }

	    private static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= num/2; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}



