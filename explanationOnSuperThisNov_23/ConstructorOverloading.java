package explanationOnSuperThisNov_23;




public class ConstructorOverloading {

	public static void main(String[] args) {
		PenType1 pen=new PenType1();
		pen=new PenType1(7);
		pen=new PenType1("rams");
		pen=new PenType1(8,5.3f);
	}

	}
class PenType1 {
	int value = 8;

	public PenType1() {
		System.out.println("needed");
	}
	public PenType1(int d) {
		System.out.println("I AM INTEGER");
		
		
	}
	public PenType1(int d,float g) {
		System.out.println("I AM INTEGER and float");
		
		
	}
	public PenType1(String value1) {
		System.out.println("I AM String");
		
		
	}




}
