package variable_methods_nov6_7;

public class LocalMethodVariablesParameters {
	public void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	public static void multiplication(double num1,double num2) {
		double result=num1*num2;
		System.out.println(result);
	}

	/* method */public static void main(String[] args) {
		int value1;
		int value2=10;
		//System.out.println(value1);//can't access  local
		System.out.println(value2);
		LocalMethodVariablesParameters localMethodVariablesParameters=new LocalMethodVariablesParameters();
		localMethodVariablesParameters.add(10, 60);
		LocalMethodVariablesParameters.multiplication(45.7, 56.3);
		

	}

}
