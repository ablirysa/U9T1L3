public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printTruck() {
        System.out.println("TRUCK DATA:" +
                "\nLiscense Plate: " + getLicensePlate() +
                "\nToll Fee: $" + getTollFee() +
                "\nNumber of Passengers: " + getPassengers() +
                "\nNumber of Axels: " + axles +
                "\nTrailer: " + hasTrailer);
    }
}