package interfaceAbstract_nov16;

//abstract class implements  interface//difference 2nd one
//it have super class object
//it   is not forcing to implement interface functions//6th one
public abstract class Home implements Student {
	int value1 = 10;

	public void vegetables() {
		System.out.println("we have enough in home!!!");
	}

	abstract void water();

	private static void television() {
		System.out.println("recharge done");
	}

	public static void main(String[] args) {
		// we cannot create object//
		// Home home=new Home();//2nd one

	}

}
