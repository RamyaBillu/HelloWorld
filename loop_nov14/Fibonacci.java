package loop_nov14;

public class Fibonacci {
	    public static void main(String[] args) {
	    	calculateAverage(20);
	    }
	        

	       
	       

	    //  to calculate the average of the first n 
	    public static void calculateAverage(int n) {
	        double sum = 0;
	        int first = 1;
	        int second = 1;
	        System.out.println("The first " + n + " Fibonacci numbers are:");


	        for (int i = 0; i < n; i++) {
	            sum += first;

	            System.out.print(first + " ");

	            int next = first + second;
	            first = second;
	            second = next;

	        }
	        System.out.println();
	        System.out.println("The average is"+sum/n);

	    }
	}



