package conditionFlow_nov10;

public class UpperLimitBound{

	    public static void main(String[] args) {
	        int upperBound = 100;

	        int sum = calculateSum(upperBound);
	        double average = calculateAverage(upperBound, sum);

	        System.out.println("The sum is " + sum);
	        System.out.println("The average is " + average);
	    }

	    // Function to calculate the sum of numbers from 1 to upperBound
	    public static int calculateSum(int upperBound) {
	        int sum = 0;
	        for (int i = 1; i <= upperBound; i++) {
	            sum += i;
	        }
	        return sum;
	    }

	    // Function to calculate the average of numbers from 1 to upperBound
	    public static double calculateAverage(int upperBound, int sum) {
	        return (double) sum / upperBound;
	    }
	}

	
