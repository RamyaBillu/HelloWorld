package stringHandling_nov24;

public class WordsReverse {

	public static void main(String[] args) {
		String s1="ramya is singer";
		String s2="";
		String temp="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			 s2+=ch;
			 if(ch==' ') {
				 temp+="";
				 temp+=s2;
				 
			 }
			 
			
		}
     
	}

}
