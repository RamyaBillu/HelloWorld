package bankTranscations;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Bank bank = new Customer();
		System.out.println("program started");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the amount to deposit");
		double amount = scanner.nextDouble();
		bank.deposit(amount);
		System.out.println("enter the amount to withdraw");
		amount = scanner.nextDouble();
		try {
			bank.withdraw(amount);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ExceedsWithdrawException e) {
			System.out.println(e.getMesage());
			e.printStackTrace();
		}
		System.out.println("program end");
	}

}
