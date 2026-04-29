import java.util.Scanner;

class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 0.04; // 4% per annum

    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance             = balance;
    }

    void calculateAndDisplayInterest() {
        double interest = balance * interest_rate;
        System.out.println("Account Holder: " + account_holder_name);
        System.out.printf("Balance       : %.2f%n", balance);
        System.out.printf("Interest Rate : %.2f%%%n", interest_rate * 100);
        System.out.printf("Interest Earned: %.2f%n", interest);
    }

    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Interest rate updated to: " + (newRate * 100) + "%");
    }
}

public class Pr10 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 50000);
        BankAccount acc2 = new BankAccount("Bob",   80000);

        acc1.calculateAndDisplayInterest();
        System.out.println();
        acc2.calculateAndDisplayInterest();

        System.out.println("\n--- Updating interest rate to 6% ---");
        BankAccount.updateInterestRate(0.06);

        System.out.println();
        acc1.calculateAndDisplayInterest();
        System.out.println();
        acc2.calculateAndDisplayInterest();
    }
}