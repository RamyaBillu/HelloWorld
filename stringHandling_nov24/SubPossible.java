package stringHandling_nov24;

public class SubPossible {

	public static void main(String[] args) {
     String s1="ramyaKrishna";
     for(int i=0;i<s1.length();i++) {
    	 for(int j=i+1;j<s1.length()+1;j++) {
    		 System.out.println( s1.substring(i, j));
    	 }
     }
	}

}
