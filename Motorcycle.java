public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean hasSidecar) {
        super(vehicleId, model, baseRentalRate);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Example: base rate + surcharge if has a sidecar
        return getBaseRentalRate() * days + (hasSidecar ? 10 : 0);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}

