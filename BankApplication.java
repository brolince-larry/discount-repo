abstract class BankAccount {

    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Error! Amount should be positive");
        }
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.0;

    public SavingsAccount(double balance) {
        super(balance);
    }

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

class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

public class BankApplication {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(200);
        savingsAccount.withdraw(100);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(200);
        checkingAccount.withdraw(100);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
}
