package operators_nov9;

import arrays_Nov8.Persons;

public class Entity {
	
	public  static int addition( int value1,int value2) {
		//arithmetic operators//
		System.out.println((20/10)*2+3-1);//BODMAS
		return (value1+value2)+10;
		
	}
	public  static  int subtraction( int value1,int value2) {
		return (value1-value2)-1;
		
	}
	public  static int multiplication( int value1,int value2) {
		return (value1*value2)+2;
		
	}
	public  static int division( int value1,int value2) {
		return (value1/value2)+1;
		
	}
	public  static int modulus( int value1,int value2) {
		return (value1%value2)+3;
		
	}
	//relational or comparison operators//
	public  static boolean less( int value1,int value2) {
		return (value1<value2);
		
	}
	public  static boolean greater( int value1,int value2) {
		return (value1>value2);
		
	}
	public  static boolean lessThanEqual( int value1,int value2) {
		return (value1<=value2);
		
	}
	public  static boolean greaterThanEqual( int value1,int value2) {
		return (value1>=value2);
		
	}
	public  static boolean equal( int value1,int value2) {
		return (value1==value2);
		
	}
	
////logical operators//
//	public  static boolean and( int value1,int value2) {
//		return ((value1<=value2)&&(value1<10));
    //System.out.println(3&2);//bitwise//
//
//		
//	}
//	public  static boolean or( int value1,int value2) {
//		return ((value1<=value2)||(value1<10));
//		
//	}
//	public  static boolean not( int value1,int value2) {
//		return (!(value1<=value2)&&(value1<10));
//		
//	}
//	//assignment operators//
//	public  static void assign(int value1,int value2) {
//		value1+=3;
//		value2-=3;
//		System.out.println(value1);
//		System.out.println(value2);
//	}
//	public static void incrementDecrement(int value1,int value2) {
//		value1++;
//		--value2;
//		++value1;
//		value2--;
//		System.out.println(value1);
//		System.out.println(value2);
//	}
	//miscellaneous//
	public static  String conditional(int value1,int value2) {
		return (value1>value2)?"great":"less";
	}
	public  boolean instanceofString(Object object) {
		System.out.println(object.getClass());
		return (object instanceof String);
	}
	public  static boolean instanceofPerson(Object object) {
		return (object instanceof Persons);
	}
	
}
