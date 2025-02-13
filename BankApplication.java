// Abstract class representing a bank account
abstract class BankAccount {
    protected double balance;

    // Constructor to initialize the balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit an amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Abstract method for withdrawal, to be implemented by subclasses
    public abstract void withdraw(double amount);

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Subclass representing a savings account
class SavingsAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.0; // Transaction fee for withdrawals

    // Constructor to initialize the balance
    public SavingsAccount(double balance) {
        super(balance);
    }

    // Implementation of the withdraw method for savings account
    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + TRANSACTION_FEE;
        if (totalAmount > 0 && totalAmount <= balance) {
            balance -= totalAmount;
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

// Subclass representing a checking account
class CheckingAccount extends BankAccount {

    // Constructor to initialize the balance
    public CheckingAccount(double balance) {
        super(balance);
    }

    // Implementation of the withdraw method for checking account
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

// Main class to test the bank accounts
public class BankApplication {
    public static void main(String[] args) {
        // Create a SavingsAccount object with an initial balance of 1000
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(200); // Deposit 200 to the savings account
        savingsAccount.withdraw(100); // Withdraw 100 from the savings account
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        // Create a CheckingAccount object with an initial balance of 1000
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(200); // Deposit 200 to the checking account
        checkingAccount.withdraw(100); // Withdraw 100 from the checking account
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
}
