package conditionFlow_nov10;
import java.util.Scanner;


public class FiveSubjects {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Array to store marks for 5 subjects
	        int[] marks = new int[5];

	        // Accept marks for each subject
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Enter marks for subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();
	        }

	        // Calculate and print minimum, maximum, and average marks
	        int minMarks = findMinValue(marks);
	        int maxMarks = findMaxValue(marks);
	        double averageMarks = findAverage(marks);

	        System.out.println("Minimum Marks: " + minMarks);
	        System.out.println("Maximum Marks: " + maxMarks);
	        System.out.println("Average Marks: " + averageMarks);

	        scanner.close();
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

	    // Function to find the average value of an array
	    public static double findAverage(int[] arr) {
	        int sum = 0;
	        for (int value : arr) {
	            sum += value;
	        }
	        return (double) sum / arr.length;
	    }
	}



