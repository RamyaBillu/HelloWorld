package interfaceAbstract_nov16;

// one
public class School implements Student {

	public static void main(String[] args) {
		School school = new School();
		school.calculate(12, 15);
		// we cannot reassign
		// value=6;

	}

	@Override
	public void calculate(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);

	}

	@Override
	public void parents() {
		// TODO Auto-generated method stub

	}

}
