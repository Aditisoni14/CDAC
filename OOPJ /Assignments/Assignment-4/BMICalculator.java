import java.util.Scanner;

class BMITracker {
    private double weight;
    private double height;
    private double bmi;

    // Constructor
    public BMITracker(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI() {
        return bmi;
    }

    public void setBMI(double bmi) {
        this.bmi = bmi;
    }
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (in kilograms): ");
        weight = scanner.nextDouble();

        System.out.print("Enter your height (in meters): ");
        height = scanner.nextDouble();
    }

    public void calculateBMI() {
        bmi = weight / (height * height);
    }

    public String classifyBMI() {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public void printRecord() {
        calculateBMI();
        String classification = classifyBMI();

        System.out.println("BMI: " + String.format("%.2f", bmi));
        System.out.println("Classification: " + classification);
    }
}
public class BMICalculator {
    public static void main(String[] args) {
        BMITracker tracker = new BMITracker(0, 0);

        tracker.acceptRecord();
        tracker.printRecord();
    }
}