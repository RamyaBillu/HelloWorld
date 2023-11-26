package explanationOnSuperThisNov_23;
//this

public class ThisExplanation {
	int value1 = 8;
	static int value2=9;

	public ThisExplanation() {
		System.out.println("no argument");
	}
	public void method1() {
		System.out.println("non-static method");
		System.out.println(this.value1);
	}
	 public ThisExplanation(int a) {
		 this();
		 this.method1();
		 System.out.println("parameterized constructor");
	 }
	

	public static void main(String[] args) {
		ThisExplanation s1=new ThisExplanation(9);
		s1.method1();
	

	}

}
