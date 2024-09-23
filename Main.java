import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class BankAccount {
    private String accountHolder;
    private double balance;
    private Map<Date, Double> fixedTermDeposits;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.fixedTermDeposits = new HashMap<>();
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Available Balance: $" + balance);
        System.out.println("Fixed-Term Deposits: ");
        if (fixedTermDeposits.isEmpty()) {
            System.out.println("No fixed-term deposits.");
        } else {
            for (Map.Entry<Date, Double> entry : fixedTermDeposits.entrySet()) {
                System.out.println("Amount: $" + entry.getValue() + " - Maturity Date: " + entry.getKey());
            }
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into your account. New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void deposit(double amount, Date maturityDate) {
        if (amount > 0) {
            fixedTermDeposits.put(maturityDate, amount);
            System.out.println("Deposited $" + amount + " as a fixed-term deposit. Maturity Date: " + maturityDate);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from your account. New Balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void checkFixedTermDeposits(Date currentDate) {
        for (Map.Entry<Date, Double> entry : fixedTermDeposits.entrySet()) {
            if (entry.getKey().before(currentDate) || entry.getKey().equals(currentDate)) {
                balance += entry.getValue();
                System.out.println("Fixed-term deposit of $" + entry.getValue() + " matured. Transferred to balance.");
                fixedTermDeposits.remove(entry.getKey());
                break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Patel ji", 1000.0);
        account.displayAccountDetails();
        account.deposit(500.0);
        account.displayAccountDetails();
        Date maturityDate = new Date(2025 - 1900, 11, 31);
        account.deposit(2000.0, maturityDate);
        account.displayAccountDetails();
        Date checkDate = new Date(2026 - 1900, 1, 1);
        account.checkFixedTermDeposits(checkDate);
        account.displayAccountDetails();
    }
}
