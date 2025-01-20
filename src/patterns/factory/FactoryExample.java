package patterns.factory;

/**
 * Demonstrates the Factory Method design pattern.
 * <p>
 * The Factory Method is a creational design pattern that provides an interface
 * for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
 * <p>
 * This example includes a few vehicle types and their respective factories.
 * Each factory returns the correct vehicle type.
 * <p>
 * SUMMARY: Encapsulates the creation of objects to provide flexibility and extensibility,
 * delegating the responsibility of object creation to a factory, which determines the specific type to instantiate.
 */
public class FactoryExample {

    //

    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory truckFactory = new TruckFactory();
        VehicleFactory bikeFactory = new BikeFactory();

        Vehicle myCar = createVehicle(carFactory);
        Vehicle myTruck = createVehicle(truckFactory);
        Vehicle myBike = createVehicle(bikeFactory);

        System.out.println(myCar.getType()); // "Car"
        System.out.println(myTruck.getType()); // "Truck"
        System.out.println(myBike.getType()); // "Bike"
    }

    public static Vehicle createVehicle(VehicleFactory factory) {
        return factory.createVehicle();
    }
}
