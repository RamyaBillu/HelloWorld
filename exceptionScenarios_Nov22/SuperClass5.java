package exceptionScenarios_Nov22;


	//...............................................................//
	//case-5//valid
	 public class SuperClass5 {
	    void example5Method() throws RuntimeException {
	System.out.println(10/0);    }
	}


	class SubClass5 extends SuperClass5 {
	    void example5Method() {
	    	System.out.println("hii");
	        // Some code
	    }
	}

