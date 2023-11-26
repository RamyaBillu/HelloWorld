package exceptionScenarios_Nov22;


	//.......................................................//
	//case-4// valid
	public class SuperiorClass4 {
	    void exampleMethod() throws RuntimeException {
	        // Some code
	    	System.out.println("case-4");
	    }
	}

	class Child4 extends SuperiorClass4 {
	    void exampleMethod() throws NullPointerException {
	        // Some code
	    }
	}


