import java.time.LocalDate;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private LocalDate fixedDepositEndDate;
    private double fixedDepositAmount;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void deposit(double amount, LocalDate endDate) {
        if (amount > 0) {
            fixedDepositAmount = amount;
            fixedDepositEndDate = endDate;
            System.out.println("Fixed deposit of: $" + amount + " until " + endDate);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (fixedDepositEndDate != null && LocalDate.now().isBefore(fixedDepositEndDate)) {
            System.out.println("Cannot withdraw fixed deposit amount until " + fixedDepositEndDate);
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789");

        account.deposit(1000);
        
        LocalDate endDate = LocalDate.now().plusMonths(6);
        account.deposit(5000, endDate);

        account.withdraw(100);
        account.withdraw(5000);
        account.withdraw(100);
    }
}
