
public class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine started.");
    }

    public void stopEngine() {
        System.out.println("Vehicle engine stopped.");
    }
}
  class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a roar.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped with a gentle purr.");
    }
}

 class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a vroom.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped with a quiet hum.");
    }
}

 class Main {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        System.out.println("Vehicle:");
        vehicle.startEngine();
        vehicle.stopEngine();

        System.out.println("\nCar:");
        car.startEngine();
        car.stopEngine();

        System.out.println("\nMotorcycle:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}