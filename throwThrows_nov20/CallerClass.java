package throwThrows_nov20;

	class CustomException extends Exception {
	    
		public CustomException(String message) {
	        super(message);
	    }
	}

	class Worker {
	    // Method that throws an exception
	    public static void performTask() throws CustomException {
	        // Simulate an exception
	        throw new CustomException("Exception in performTask method");
	    }
	}
	public class CallerClass {


	    public static void main(String[] args) {
	        try {
	            // Call the method that throws an exception
	            Worker.performTask();
	        } catch (CustomException e) {
	            // Handle the exception in the caller class
	            System.out.println("Caught exception in CallerClass: " + e.getMessage());
	        } finally {
	            System.out.println("Finally block executed in CallerClass");
	        }
	    }
	}



