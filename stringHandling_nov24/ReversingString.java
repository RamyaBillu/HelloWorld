package stringHandling_nov24;

public class ReversingString {

	public static void main(String[] args) {
		String str = "CoreNuts Technologies ";
		String str1 = "";
		String str2="";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			str1 += ch;
			
		
		}
		System.out.println(str1);
		System.out.println(str2);

	}
}
