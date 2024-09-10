import java.util.Scanner;

class CompoundInterestCalculator {
    private double principal;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int years;

    public CompoundInterestCalculator(double principal, double annualInterestRate, int numberOfCompounds, int years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.numberOfCompounds = numberOfCompounds;
        this.years = years;
    }

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

    public int getNumberOfCompounds() {
        return numberOfCompounds;
    }

    public void setNumberOfCompounds(int numberOfCompounds) {
        this.numberOfCompounds = numberOfCompounds;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double calculateFutureValue() {
        double futureValue = principal * Math.pow(1 + annualInterestRate / numberOfCompounds, numberOfCompounds * years);
        return futureValue;
    }

    public double calculateTotalInterestEarned() {
        double futureValue = calculateFutureValue();
        double totalInterestEarned = futureValue - principal;
        return totalInterestEarned;
    }

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount (in ₹): ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        annualInterestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times the interest is compounded per year: ");
        numberOfCompounds = scanner.nextInt();

        System.out.print("Enter the investment duration (in years): ");
        years = scanner.nextInt();
    }
    
    public void printRecord() {
        double futureValue = calculateFutureValue();
        double totalInterestEarned = calculateTotalInterestEarned();

        System.out.println("Future Value: ₹" + String.format("%.2f", futureValue));
        System.out.println("Total Interest Earned: ₹" + String.format("%.2f", totalInterestEarned));
    }
}

public class program{
    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator(0, 0, 0, 0);

        calculator.acceptRecord();
        calculator.printRecord();
    }
}