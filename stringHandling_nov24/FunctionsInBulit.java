package stringHandling_nov24;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FunctionsInBulit {

	public static void main(String[] args) {
		String str = new String("kumar");
		String str1="komali";
		String str3="CoreNuts Technologies Pvt ltd";
		String str4="";
		//12
		int[]a= {1,3,5};
		for(int i=0;i<a.length;i++) {
			str4+=a[i];
			
		}
		System.out.println(str4);
		
		
		//1//
		System.out.println(str1.toCharArray());
		//2
		System.out.println(str3.substring(0, 22));
		System.out.println(str.length());
		
		System.out.println(str1.length());
		//3
		System.out.println(str1 == str);
		//4
		System.out.println(str1.equals(str));
		System.out.println(str1.concat("k"));
		System.out.println(str1.contains("k"));
		System.out.println(str.endsWith("a"));
		System.out.println(str.startsWith("k"));
		System.out.println(str.charAt(3));
		System.out.println(str.compareTo(str1));
		System.out.println(str.indexOf('k'));
		StringBuffer buffer=new StringBuffer("CoreNuts Technologies Pvt ltd");
		//thread safe
		System.out.println(buffer);
		StringBuilder builder=new StringBuilder("672378");
		System.out.println(builder);
		//6
		//System.out.println(buffer.reverse());
		System.out.println(buffer.delete(9, 22));
		
		

	}
}
