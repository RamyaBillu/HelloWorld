package throwThrows_nov20;

import java.io.IOException;

	
	
	public class CallerHandling {


	public static void main(String[] args) {
		CallerHandling callerHandling=new CallerHandling();
		callerHandling.method1();
		
		

	}
	
	public void method2() {
		int result=10/0;
		System.out.println("hi");
		
	}

	private void method1() {
		try {
			method2();

			
		}
		catch(Exception e) {
			System.out.println("solved");
		}
		System.out.println("....");
		
	}

}
