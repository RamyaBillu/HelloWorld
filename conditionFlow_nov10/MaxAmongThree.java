package conditionFlow_nov10;

import java.util.Scanner;

public class MaxAmongThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1:");
		int num1 = sc.nextInt();
		System.out.println("enter num2:");
		int num2 = sc.nextInt();
		System.out.println("enter num3:");
		int num3 = sc.nextInt();
		if ((num1 >= num2) && (num1 >= num3))
			System.out.println("max=" + num1);
		else if ((num2 >= num1) && (num2 >= num3))
			System.out.println("max=" + num2);
		else
			System.out.println("max=" + num3);
	}

}
