class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else if (amount > 0 && balance < amount) {
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "John", 500.0);
        BankAccount account2 = new BankAccount("987654321", "Jane ", 1000.0);
        BankAccount account3 = new BankAccount("567890123", "Alice ", 750.0);

        account1.deposit(200);
        account2.withdraw(150);
        account3.withdraw(800);  // Should show insufficient balance

        account1.displayAccountInfo();
        System.out.println();
        account2.displayAccountInfo();
        System.out.println();
        account3.displayAccountInfo();
    }
}
