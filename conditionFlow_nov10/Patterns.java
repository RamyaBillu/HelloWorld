package conditionFlow_nov10;

public class Patterns {

	    public static void main(String[] args) {
	    	int n=5;
	    	for (int i = 1; i <=n; i++) {
	    		int k=1;
	    		for (int j = 0; j < i; j++) {
	    			if(i!=2)System.out.print(k);
	    			k++;
	    		}
	    		if(i!=2)System.out.println();
	    		

	       
	        }
	    	System.out.println("---------");
	    
	       //nested hash
	        for(int i=1;i<=5;i++) {
	        	for(int j=1;j<=5;j++) {
	        		System.out.print("#"+"");
	        	}
	        	System.out.println();
	        }
	        System.out.println("-----");
	        //checker board
	        for(int i=1;i<=7;i++) {
	        	for(int j=1;j<=7;j++) {
	        		System.out.print("#"+"");
	        	}
	        	System.out.println();
	        }
	        System.out.println("-------------");
	        // AsteriskPattern 

	                int row = 10; // You can adjust the number of rows as needed

	                for (int i = row; i >= 1; i--) {
	                    for (int j = 1; j <= i; j++) {
	                        System.out.print("*");
	                    }
	                    System.out.println();
	                }
	            }
}
	    
	   

	        
	




