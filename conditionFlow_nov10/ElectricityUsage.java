package conditionFlow_nov10;
import java.util.Scanner;


public class ElectricityUsage {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of units consumed: ");
	        int unitsConsumed = scanner.nextInt();

	        double billAmount = calculateBill(unitsConsumed);
	        String usageType = determineUsage(unitsConsumed);

	        System.out.println("Electricity Bill: Rs " + billAmount);
	        System.out.println("Usage: " + usageType);

	        scanner.close();
	    }

	    // Function to calculate the electricity bill based on units consumed
	    public static double calculateBill(int unitsConsumed) {
	        double billAmount;

	        if (unitsConsumed <= 50) {
	            // Minimum Usage
	            billAmount = 250;
	        } else if (unitsConsumed <= 100) {
	            // Moderate Usage
	            billAmount = 250 + (unitsConsumed - 50) * 5;
	        } else {
	            // High Usage
	            billAmount = 250 + 50 * 5 + (unitsConsumed - 100) * 8;
	        }

	        return billAmount;
	    }

	    // Function to determine the usage type based on units consumed
	    public static String determineUsage(int unitsConsumed) {
	        if (unitsConsumed <= 50) {
	            return "Minimum Usage";
	        } else if (unitsConsumed <= 100) {
	            return "Moderate Usage";
	        } else {
	            return "High Usage";
	        }
	    }
	


}
