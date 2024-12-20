import java.util.List;

public class RentalAgency {
    private final List<Vehicle> vehicleFleet;

    public RentalAgency(List<Vehicle> vehicleFleet) {
        this.vehicleFleet = vehicleFleet;
    }

    public void rentVehicle(Customer customer, Vehicle vehicle, int days) {
        customer.rentVehicle(vehicle, days);
    }

    public void returnVehicle(Customer customer) {
        customer.returnVehicle();
    }

    public void printAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.isAvailableForRental()) {
                System.out.println(vehicle.getModel());
            }
        }
    }
}

