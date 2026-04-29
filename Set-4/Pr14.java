import java.util.Scanner;

class BankAccount14 {
    protected int    accountNumber;
    protected String accountHolderName;
    protected double balance;

    void openAccount(int accNo, String name, double initialDeposit) {
        accountNumber     = accNo;
        accountHolderName = name;
        balance           = initialDeposit;
        System.out.println("Account opened successfully for " + name);
    }

    void deposit(double amount) {
        if (amount <= 0) { System.out.println("Invalid deposit amount."); return; }
        balance += amount;
        System.out.printf("Deposited: %.2f | New Balance: %.2f%n", amount, balance);
    }

    void withdraw(double amount) {
        if (amount <= 0)       { System.out.println("Invalid amount."); return; }
        if (amount > balance)  { System.out.println("Insufficient balance."); return; }
        balance -= amount;
        System.out.printf("Withdrawn: %.2f | New Balance: %.2f%n", amount, balance);
    }

    void checkBalance() {
        System.out.printf("Balance of %s (Acc#%d): %.2f%n", accountHolderName, accountNumber, balance);
    }
}

class SavingAccount extends BankAccount14 {
    private double interestRate = 0.04; // 4%

    void calculateInterest() {
        double interest = balance * interestRate;
        System.out.printf("Interest earned (%.0f%%): %.2f%n", interestRate * 100, interest);
    }
}

class FixedDepositAccount extends BankAccount14 {
    private double fdRate = 0.07; 
    private int    years;

    void setTerm(int years) { this.years = years; }

    void maturityAmount() {
        double maturity = balance * Math.pow(1 + fdRate, years);
        System.out.printf("FD Maturity Amount after %d years @ %.0f%%: %.2f%n",
                          years, fdRate * 100, maturity);
    }
}

public class Pr14 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.openAccount(1001, "Alice", 20000);
        sa.deposit(5000);
        sa.withdraw(3000);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println();

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(2001, "Bob", 50000);
        fd.setTerm(3);
        fd.checkBalance();
        fd.maturityAmount();
    }
}