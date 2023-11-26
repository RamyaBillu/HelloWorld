package variable_methods_nov6_7;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("start range");
		int n = s.nextInt();
		System.out.println("ending range");
		int e=s.nextInt();
		System.out.println("-----------");
		if(n>=1&&e<=120) {
		for(int n1=n;n1<=e;n1++) {


			for (int mult = 1; mult <= 10; mult++) {
				System.out.println(n1 + "*" + mult + "=" + n1 * mult);
			}
			System.out.println("-----------");
		}
		}
		else System.out.println("numbers u entered out of range");
	}
}


