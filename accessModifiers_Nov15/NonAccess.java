package accessModifiers_Nov15;

public class NonAccess {
    static String hero="charan";
    public  final void accessMethod5() {
		   System.out.println("happy to here");
	   } //we cannot change this implementation further
    



	public static void main(String[] args) {
		  final String city="chennai";
		  // we cannot reinitialize city="hyderabad";
		  NonAccess nonAccess=new NonAccess();

	}

}
