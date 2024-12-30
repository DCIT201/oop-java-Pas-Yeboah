package RentalSystem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("15611134","Cybertruck",4.6,56.67);
        System.out.println("Your truck ID is:" + truck.getVehicleId());
        System.out.println("Your truck model is:"+truck.getModel());
        System.out.println("Your truck loadcapacity is:"+truck.getLoadCapacity());

     Car car = new Car("24552364", "Maybach",5.5,4);
        System.out.println("Availability"+car.isAvailableForRental());
        System.out.println("Your Car rental cost is :"+car.calculateRentalCost(10));

Motorcycle motorcycle= new Motorcycle("2366726","nissan",4.6,false);
        System.out.println("Availability of motorcycle sidecars is:"+motorcycle.hasSidecar());
        System.out.println("Your motorcycle rental cost is:"+motorcycle.calculateRentalCost(40));

        Customer customer= new Customer("24562736","Marilyn Baah");

    }
}