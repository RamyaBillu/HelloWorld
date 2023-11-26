package accessModifiers_Nov15;

public class AllAcess {
	   private String place="bangalore";
	   //non access modifiers
	 
	   public int age=9;
	   protected int rank=1;
	   int state=7;
	   public void accessMethod1() {
		   System.out.println("happy to exit");
	   }
	   private void accessMethod2() {
		   System.out.println("happy to smile");
	   }
	   protected void accessMethod3() {
		   System.out.println("happy to smoke");
	   } 
	   void accessMethod4() {
		   System.out.println("happy to mile");
	   }
	  

	public static void main(String[] args) {
		AllAcess allAcess=new AllAcess();
		allAcess.accessMethod1();
     
	}

}
