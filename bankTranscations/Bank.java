package bankTranscations;

public interface Bank {
	void withdraw(double amount) throws InsufficientBalanceException,ExceedsWithdrawException;
	void deposit(double amount);

}
