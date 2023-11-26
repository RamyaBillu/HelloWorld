package stringHandling_nov24;

public class Repeated {

	public static void main(String[] args) {
     String s2="anusha";
     int count=0;
     for(int i=0;i<s2.length();i++) {
    	 char ch=s2.charAt(i);
    	 if((int)ch==(int)s2.charAt(i++)) {
    		 count+=1;
             System.out.println(count+""+s2.charAt(i));
             count=0;

    				 
    	 }

    	 
	}
	}
}


