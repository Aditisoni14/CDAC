import java.util.Scanner;

class TollBoothRevenueManager {
    private double carTollRate;
    private double truckTollRate;
    private double motorcycleTollRate;
    private int numCars;
    private int numTrucks;
    private int numMotorcycles;
    private double totalRevenue;

    // Constructor
    public TollBoothRevenueManager(double carTollRate, double truckTollRate, double motorcycleTollRate) {
        this.carTollRate = carTollRate;
        this.truckTollRate = truckTollRate;
        this.motorcycleTollRate = motorcycleTollRate;
    }

    public double getCarTollRate() {
        return carTollRate;
    }

    public void setCarTollRate(double carTollRate) {
        this.carTollRate = carTollRate;
    }

    public double getTruckTollRate() {
        return truckTollRate;
    }

    public void setTruckTollRate(double truckTollRate) {
        this.truckTollRate = truckTollRate;
    }

    public double getMotorcycleTollRate() {
        return motorcycleTollRate;
    }

    public void setMotorcycleTollRate(double motorcycleTollRate) {
        this.motorcycleTollRate = motorcycleTollRate;
    }

    public int getNumCars() {
        return numCars;
    }

    public void setNumCars(int numCars) {
        this.numCars = numCars;
    }

    public int getNumTrucks() {
        return numTrucks;
    }

    public void setNumTrucks(int numTrucks) {
        this.numTrucks = numTrucks;
    }

    public int getNumMotorcycles() {
        return numMotorcycles;
    }

    public void setNumMotorcycles(int numMotorcycles) {
        this.numMotorcycles = numMotorcycles;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    // Method to set toll rates
    public void setTollRates() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the toll rate for Car (in ₹): ");
        carTollRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Truck (in ₹): ");
        truckTollRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Motorcycle (in ₹): ");
        motorcycleTollRate = scanner.nextDouble();
    }

    // Method to accept record
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Cars: ");
        numCars = scanner.nextInt();

        System.out.print("Enter the number of Trucks: ");
        numTrucks = scanner.nextInt();

        System.out.print("Enter the number of Motorcycles: ");
        numMotorcycles = scanner.nextInt();
    }

    // Business logic method to calculate revenue
    public void calculateRevenue() {
        totalRevenue = (numCars * carTollRate) + (numTrucks * truckTollRate) + (numMotorcycles * motorcycleTollRate);
    }

    // Method to print record
    public void printRecord() {
        calculateRevenue();

        System.out.println("Total Number of Vehicles: " + (numCars + numTrucks + numMotorcycles));
        System.out.println("Total Revenue: ₹" + String.format("%.2f", totalRevenue));
    }
}

 public class program {
    public static void main(String[] args) {
        TollBoothRevenueManager manager = new TollBoothRevenueManager(50.00, 100.00, 30.00);

        manager.setTollRates();
        manager.acceptRecord();
        manager.printRecord();
    }
}
