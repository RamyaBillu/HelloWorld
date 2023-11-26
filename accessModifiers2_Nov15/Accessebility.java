package accessModifiers2_Nov15;

import accessModifiers_Nov15.AllAcess;

public class Accessebility {

	public static void main(String[] args) {
		AllAcess acess=new AllAcess();
		acess.accessMethod1();
		System.out.println(acess.age);
		// private protected default we cannot access
		//compile time error


	}

}
