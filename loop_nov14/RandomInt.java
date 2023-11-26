package loop_nov14;
import java.util.Random;


public class RandomInt {

	    public static void main(String[] args) {
	        // Create a Random object to generate random integers
	        Random random = new Random();

	        // Generate a second random value for comparison
	        int secondRandomValue = random.nextInt(100); // You can change the range as needed

	        // Generate 25 random integers and compare each with the second random value
	        for(int i=0;i<25;i++) {
	            int randomValue = random.nextInt(100); // You can change the range as needed

	            // Compare the random value with the second random value
	            if (randomValue > secondRandomValue) {
	                System.out.println(randomValue + " is greater than " + secondRandomValue);
	            } else if (randomValue < secondRandomValue) {
	                System.out.println(randomValue + " is less than " + secondRandomValue);
	            } else {
	                System.out.println(randomValue + " is equal to " + secondRandomValue);
	            }
	        }
	    }
	}



