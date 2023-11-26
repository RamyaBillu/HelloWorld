package exceptionScenarios_Nov22;

import java.io.IOException;

public class SuperiorClass3 {
	    void exampleMethod() throws Exception {
	        // Some code
	    }
	}

	class Child3 extends SuperiorClass3{
	    void exampleMethod() throws IOException {
	        // Some code
	    	System.out.println("case-3");
	    }


}
