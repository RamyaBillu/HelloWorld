package exceptions_nov17;

import java.util.Scanner;

	import java.util.Scanner;

	class InsufficientFundsException extends Exception {
	    public InsufficientFundsException(String message) {
	        super(message);
	    }
	}

	class NegativeAmountException extends Exception {
	    public NegativeAmountException(String message) {
	        super(message);
	    }
	}

	class BankAccount {
	    private double balance;

	    public BankAccount(double initialBalance) throws NegativeAmountException {
	        if (initialBalance < 0) {
	            throw new NegativeAmountException("Initial balance cannot be negative");
	        }
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) throws NegativeAmountException {
	        if (amount < 0) {
	            throw new NegativeAmountException("Deposit amount cannot be negative");
	        }
	        this.balance += amount;
	    }

	    public void withdraw(double amount) throws NegativeAmountException, InsufficientFundsException {
	        if (amount < 0) {
	            throw new NegativeAmountException("Withdrawal amount cannot be negative");
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient funds for withdrawal");
	        }
	        this.balance -= amount;
	    }

	    public double getBalance() {
	        return balance;
	    }
	}

	public class Balance {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter initial balance: ");
	            double initialBalance = scanner.nextDouble();
	            BankAccount account = new BankAccount(initialBalance);

	            while (true) {
	                System.out.println("\n1. Deposit");
	                System.out.println("2. Withdraw");
	                System.out.println("3. Check Balance");
	                System.out.println("4. Exit");
	                System.out.print("Choose an option (1-4): ");
	                int choice = scanner.nextInt();

	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter deposit amount: ");
	                        double depositAmount = scanner.nextDouble();
	                        account.deposit(depositAmount);
	                        System.out.println("Deposit successful. New balance: " + account.getBalance());
	                        break;
	                    case 2:
	                        System.out.print("Enter withdrawal amount: ");
	                        double withdrawalAmount = scanner.nextDouble();
	                        account.withdraw(withdrawalAmount);
	                        System.out.println("Withdrawal successful. New balance: " + account.getBalance());
	                        break;
	                    case 3:
	                        System.out.println("Current balance: " + account.getBalance());
	                        break;
	                    case 4:
	                        System.out.println("Exiting program. Thank you!");
	                        System.exit(0);
	                    default:
	                        System.out.println("Invalid choice. Please choose again.");
	                        break;
	                }
	            }
	        } catch (NegativeAmountException | InsufficientFundsException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Error: Invalid input. Please enter a valid number.");
	        } finally {
	            scanner.close();
	        }
	        System.out.println("bye");
	    }
	}


	

	




