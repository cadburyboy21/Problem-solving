package CDS.Day7;
import java.util.Scanner;

class Loan {
    float homeLoanRate = 0.08f;
    float carLoanRate = 0.10f;
    float eduLoanRate = 0.05f;

    public float calculateInterest(String loanType, float amount) {
        float interest = 0.0f;
        if (loanType.equalsIgnoreCase("HomeLoan")) {
            interest = amount * homeLoanRate;
        } else if (loanType.equalsIgnoreCase("CarLoan")) {
            interest = amount * carLoanRate;
        } else if (loanType.equalsIgnoreCase("EduLoan")) {
            interest = amount * eduLoanRate;
        } else {
            System.out.println("Invalid loan type. Defaulting to EduLoan rate.");
            interest = amount * eduLoanRate;
        }
        return interest;
    }
}

public class LoanCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loan loan = new Loan();

        System.out.print("Enter the Loan Type (HomeLoan, CarLoan, EduLoan): ");
        String loanType = sc.nextLine();

        System.out.print("Enter the Amount: RS:");
        float amount = sc.nextFloat();

        float interest = loan.calculateInterest(loanType, amount);
        System.out.println("Calculated Interest: Rs:" + interest);
    }
}
