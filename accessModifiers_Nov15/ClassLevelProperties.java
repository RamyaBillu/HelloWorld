package accessModifiers_Nov15;

public class ClassLevelProperties {
	
	public static void main(String[] args) {
		Parent parent=new Parent();
		//through instance
		System.out.println("through instance");
		System.out.println(parent.age);
		System.out.println(parent.name);
		System.out.println("...........");
		System.out.println("through inheritance");
		//through inheritance
		Child child=new Child();
		System.out.println(child.age);
		System.out.println(child.name);


	}
}
	// abstract//
//final //
class Parent{//we cannot at a time
		int age=8;
		String name="ramya";
		public void dispaly() {
			System.out.println("good to see");
		}
			final void live() {
				   System.out.println("happy to mile");
			   }
		}
	
	class Child extends Parent{//due to final
		public void dispaly() {
			System.out.println("bad");
		}
		//final void live() {//we cannot
			   //System.out.println("happy to milestone");
		  // }
		
	}


