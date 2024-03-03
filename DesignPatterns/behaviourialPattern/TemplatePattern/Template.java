abstract class SelfDrivingVehicle {
    String make;
    String model;
    int year;
    float maxSpeed;
    int autonomyLevel;

    public SelfDrivingVehicle(String make, String model, int year, float maxSpeed, int autonomyLevel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.autonomyLevel = autonomyLevel;
    }

    void accelerate(float speedIncrease) {
        // Code to increase the vehicle's speed
    }

    void decelerate(float speedDecrease) {
        // Code to decrease the vehicle's speed
    }

    void navigate(String destination) {
        // Code to navigate the vehicle to the specified destination
    }

    abstract void performSelfDrivingTask();
}

class SelfDrivingCar extends SelfDrivingVehicle {
    int numPassengers;
    float batteryLife;

    public SelfDrivingCar(String make, String model, int year, float maxSpeed, int autonomyLevel, int numPassengers, float batteryLife) {
        super(make, model, year, maxSpeed, autonomyLevel);
        this.numPassengers = numPassengers;
        this.batteryLife = batteryLife;
    }

    void chargeBattery(float chargeAmount) {
        // Code to charge the car's battery
    }

    @Override
    void performSelfDrivingTask() {
        // Specific implementation for self-driving cars
    }
}

class SelfDrivingBike extends SelfDrivingVehicle {
    String bikeType;

    public SelfDrivingBike(String make, String model, int year, float maxSpeed, int autonomyLevel, String bikeType) {
        super(make, model, year, maxSpeed, autonomyLevel);
        this.bikeType = bikeType;
    }

    void adjustHandlebars(float height) {
        // Code to adjust the height of the bike's handlebars
    }

    @Override
    void performSelfDrivingTask() {
        // Specific implementation for self-driving bikes
    }
}

public class Main {
    public static void main(String[] args) {
        SelfDrivingCar car = new SelfDrivingCar("Tesla", "Model S", 2023, 250, 5, 4, 80);
        SelfDrivingBike bike = new SelfDrivingBike("Giant", "Reign", 2024, 30, 3, "Mountain Bike");

        car.performSelfDrivingTask();
        bike.performSelfDrivingTask();
    }
}
