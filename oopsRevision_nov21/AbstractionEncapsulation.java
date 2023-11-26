package oopsRevision_nov21;
//abstraction
 abstract class AbstractClass{
	 abstract void hide();
	 public void know() {
		 System.out.println("i am here");
	 }//it has both abstract and concrete
	
}
 interface Abstraction{
	 void hide();
	 default void know() {
		 System.out.println("i will show details");
		 
	 }
	 
 }//it has only abstract and static final constants
 //encapsulation
 class Capsule{
	 private int data=6;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	 
	 
 }
 //test

public class AbstractionEncapsulation implements Abstraction {

	public static void main(String[] args) {
		Capsule capsule=new Capsule();
		System.out.println(capsule.getData());
		capsule.setData(10);
		System.out.println(capsule.getData());
		AbstractionEncapsulation abstractionEncapsulation=new AbstractionEncapsulation();
		abstractionEncapsulation.know();
		
     
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
	}

}
