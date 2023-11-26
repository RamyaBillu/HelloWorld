package exceptions_nov17;

public class AvoidNullPointer {
	    public static void main(String[] args) {
	        try {
	            // Avoiding NullPointerException by checking if the reference variable is null
	            String str = "ram";
	            
	            if (str != null) {
	                System.out.println("Length of the string: " + str.length());
	                
	            } 
	        } catch (NullPointerException e) {
	            // This block won't be executed because we have already checked for null
	            System.out.println("Caught NullPointerException: " + e.getMessage());
	        } finally {
	            // Code in the finally block will be executed no matter what
	            System.out.println("Finally block executed");
	        }
	        System.out.println("enter");
	    }
	}



