package throwThrows_nov20;

import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args)   {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
		int value=scanner.nextInt();
       try {
    	   System.out.println("value : "+value);
    	   try {
    		   if(value<10) {
    			   int result= value/0;
    		   }
    	   }
    	   catch(ArithmeticException e) {
        	   System.out.println(e.getMessage());
    	   
       }
       
       }
       finally {
    	   System.out.println("executed");
       }
	}

}
