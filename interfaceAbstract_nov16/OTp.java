package interfaceAbstract_nov16;

import java.util.Random;

public class OTp {

	public static void main(String[] args) {
		Random random = new Random();
		int i = 0;
		while (i < 10) {
			int first = random.nextInt(10);
			int second = random.nextInt(10);
			int third = random.nextInt(10);
			int fourth = random.nextInt(10);
			System.out.println(first + "" + second + "" + third + "" + fourth);
			i++;
		}

	}
}
