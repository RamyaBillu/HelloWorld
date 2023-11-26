package bankTranscations;

public class Customer implements Bank {
	public double balance = 500;

	@Override
	public void withdraw(double amount) throws InsufficientBalanceException, ExceedsWithdrawException {
		if (amount >= 5000) {
			throw new ExceedsWithdrawException("Withdrawamount should be within 500");
		} else if (amount > balance) {
			throw new InsufficientBalanceException("insufficient balance");
		} else {
			System.out.println("total amount before withdraw" + balance);
			System.out.println("withdraw amount is " + amount);
			balance = balance - amount;

			System.out.println("after withdraw amount is" + balance);
		}
	}

	@Override
	public void deposit(double amount) {
		System.out.println("total amount before deposit" + balance);
		System.out.println("depositing amount" + amount);
		balance = balance + amount;
		System.out.println("total amount after deposit" + balance);
	}

}
