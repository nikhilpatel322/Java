class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public void setAccountDetails(long accNumber, String holderName, double initialBalance) {
        accountNumber = accNumber;
        accountHolderName = holderName;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankMgmntSystem {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountDetails(1234567890, "John Doe", 1000.0);

        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.checkBalance();
    }
}
