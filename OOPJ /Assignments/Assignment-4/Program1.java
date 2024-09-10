import java.util.Scanner;

class LoanAmortizationCalculator {
    private double principal;
    private double annualInterestRate;
    private int loanTerm;

    // Constructor
    public LoanAmortizationCalculator(double principal, double annualInterestRate, int loanTerm) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
    }

    // Getter and Setter methods
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }
    
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
        return monthlyPayment;
    }

    public double calculateTotalAmountPaid() {
        double monthlyPayment = calculateMonthlyPayment();
        int numberOfMonths = loanTerm * 12;
        double totalAmountPaid = monthlyPayment * numberOfMonths;
        return totalAmountPaid;
    }

    public void acceptRecord() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the principal amount (in ₹): ");
            principal = scanner.nextDouble();

            System.out.print("Enter the annual interest rate (in %): ");
            annualInterestRate = scanner.nextDouble() / 100;

            System.out.print("Enter the loan term (in years): ");
            loanTerm = scanner.nextInt();
        }
    }

    public void printRecord() {
        double monthlyPayment = calculateMonthlyPayment();
        double totalAmountPaid = calculateTotalAmountPaid();

        System.out.println("Monthly Payment: ₹" + String.format("%.2f", monthlyPayment));
        System.out.println("Total Amount Paid: ₹" + String.format("%.2f", totalAmountPaid));
    }
}

public class Program1 {
    public static void main(String[] args) {
        LoanAmortizationCalculator calculator = new LoanAmortizationCalculator(0, 0, 0);

        calculator.acceptRecord();
        calculator.printRecord();
    }
}