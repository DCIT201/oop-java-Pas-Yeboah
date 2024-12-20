
    public abstract class Vehicle {
        private String vehicleId;
        private String model;
        private double baseRentalRate;
        private boolean isAvailable;

        // Constructor
        public Vehicle(String vehicleId, String model, double baseRentalRate) {
            this.vehicleId = vehicleId;
            this.model = model;
            setBaseRentalRate(baseRentalRate);
            this.isAvailable = true;
        }

        // Getters and Setters with validation
        public String getVehicleId() {
            return vehicleId;
        }

        public void setVehicleId(String vehicleId) {
            this.vehicleId = vehicleId;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public double getBaseRentalRate() {
            return baseRentalRate;
        }

        public void setBaseRentalRate(double baseRentalRate) {
            if (baseRentalRate > 0) {
                this.baseRentalRate = baseRentalRate;
            } else {
                throw new IllegalArgumentException("Base rental rate must be positive.");
            }
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }

        // Abstract methods to be implemented by subclasses
        public abstract double calculateRentalCost(int days);

        public abstract boolean isAvailableForRental();
    }


