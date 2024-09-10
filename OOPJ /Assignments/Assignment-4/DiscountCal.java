import java.util.Scanner;

class DiscountCalculator {
    private double originalPrice;
    private double discountRate;
    private double discountAmount;
    private double finalPrice;

    // Constructor
    public DiscountCalculator(double originalPrice, double discountRate) {
        this.originalPrice = originalPrice;
        this.discountRate = discountRate;
    }

    // Getter and Setter methods
    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    // Method to accept record
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price of the item (in ₹): ");
        originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage (%): ");
        discountRate = scanner.nextDouble();
    }

    // Business logic method to calculate discount amount
    public void calculateDiscount() {
        discountAmount = originalPrice * (discountRate / 100);
        finalPrice = originalPrice - discountAmount;
    }

    // Method to print record
    public void printRecord() {
        calculateDiscount();

        System.out.println("Discount Amount: ₹" + String.format("%.2f", discountAmount));
        System.out.println("Final Price: ₹" + String.format("%.2f", finalPrice));
    }
}

public class DiscountCal {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator(0, 0);

        calculator.acceptRecord();
        calculator.printRecord();
    }
}