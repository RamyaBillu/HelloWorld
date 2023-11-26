package oopsRevision_nov21;

public class OverridingDynamic extends Dog {
	   static int value1=9;
	  

	public static void main(String[] args) {
		OverridingDynamic overridingDynamic=new OverridingDynamic();
		overridingDynamic.eat();
		overridingDynamic.legs();
		overridingDynamic.walk();
		System.out.println(value1);
      
	}

}
