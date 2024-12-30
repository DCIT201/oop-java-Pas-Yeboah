package RentalSystem;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String vehicleId, String model, double baseRentalRate, int numberOfDoors) {
        super(vehicleId, model, baseRentalRate);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Example: base rate + extra cost based on the number of doors
        return getBaseRentalRate() * days + (numberOfDoors * 5);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}


