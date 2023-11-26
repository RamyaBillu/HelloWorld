package accessModifiers_Nov15;

import java.util.Scanner;

public class Weeks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int number = sc.nextInt();
		switch (number) {
		default:
			System.out.println("invalid number");
//			break;
			return;

		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;

		case 3:
			System.out.println("wednesday");
			break;

		case 4:
			System.out.println("thursday");
			break;

		case 5:
			System.out.println("friday");
			break;

		case 6:// {
			System.out.println("saturday");
			System.out.println("weekend");

			break;
		// }//blocks not needed

		case 7:
			System.out.println("sunday");
			System.out.println("funday");

			break;
		}
		System.out.println("good work");// it will come out from main if we use return
	}

}
