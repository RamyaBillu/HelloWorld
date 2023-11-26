package conditionFlow_nov10;

public class IntegerArrayMaxMin {

	    public static void main(String[] args) {
	        int[] numbers = {5, 2, 9, 1, 7, 3, 8};

	        int minValue = findMinValue(numbers);
	        int maxValue = findMaxValue(numbers);

	        System.out.println("Minimum Value: " + minValue);
	        System.out.println("Maximum Value: " + maxValue);
	    }

	    // Function to find the minimum value in an array
	    public static int findMinValue(int[] arr) {
	        int min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        return min;
	    }

	    // Function to find the maximum value in an array
	    public static int findMaxValue(int[] arr) {
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }
	}



