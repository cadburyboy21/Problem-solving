package CDS;
import java.util.Scanner;

public class BankAccount {
    private String holderName;
    private String accountNo;
    private double balance;

    public BankAccount(String holderName, String accountNo) {
        this.holderName = holderName;
        this.accountNo = accountNo;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance. Withdrawal Failed.");
        }
    }


    public void showBalance() {
        System.out.println("Remaining Balance: Rs " + (int)balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        BankAccount account = new BankAccount(name, accNo);

        System.out.print("Enter Deposit Amount: ");
        double depositAmt = sc.nextDouble();
        account.deposit(depositAmt);

        System.out.print("Enter Withdraw Amount: ");
        double withdrawAmt = sc.nextDouble();
        account.withdraw(withdrawAmt);

        account.showBalance();

        sc.close();
    }
}
