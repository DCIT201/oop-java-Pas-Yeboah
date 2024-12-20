import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<Vehicle> rentalHistory;
    private Vehicle currentRental;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.setAvailable(false);
            this.currentRental = vehicle;
            rentalHistory.add(vehicle);
            System.out.println("Vehicle rented: " + vehicle.getModel());
        } else {
            System.out.println("Vehicle is not available for rental.");
        }
    }

    public void returnVehicle() {
        if (currentRental != null) {
            currentRental.setAvailable(true);
            System.out.println("Vehicle returned: " + currentRental.getModel());
            currentRental = null;
        } else {
            System.out.println("No vehicle to return.");
        }
    }

    // Getters and setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }

    public void setRentalHistory(List<Vehicle> rentalHistory) {
        this.rentalHistory = rentalHistory;
    }
}


