package conditionFlow_nov10;

import java.util.Scanner;

public class GradingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total marks:");
		int totalMarks = sc.nextInt();
		char grade;
		switch (totalMarks / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;

		case 8:
		case 7:
			grade = 'B';
			break;
		case 6:
		case 5:
			grade = 'C';
			break;
		case 4:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		if(grade=='F')System.out.println("fail");
		else
		System.out.println(grade);
	}

}
