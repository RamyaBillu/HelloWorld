package throwThrows_nov20;

	class InitialException extends Exception {
	    public InitialException(String message) {
	        super(message);
	    }
	}

	class SecondaryException extends Exception {
	    public SecondaryException(String message) {
	        super(message);
	    }
	}

	public class UserDefinedFromCatch {
	    public static void main(String[] args) {
	        try {
	            // Simulate an initial exception
	            throw new InitialException("This is the first exception");
	        } catch (InitialException e) {
	            System.out.println("Caught first exception: " + e.getMessage());

	            try {
	                // Raise a secondary exception from the catch block
	                throw new SecondaryException("This is the second exception");
	            } catch (SecondaryException se) {
	                System.out.println("Caught the second exception: " + se.getMessage());
	            }
	        } finally {
	            System.out.println("Finally block");
	        }
	    }
	}



