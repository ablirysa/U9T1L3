public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi() {
        System.out.println("TAXI DATA:" +
                "\nLiscense Plate: " + getLicensePlate() +
                "\nToll Fee: $" + getTollFee() +
                "\nNumber of Passengers: " + getPassengers() +
                "\nElectric: " + isElectric() +
                "\nDiscount Applied: " + isDiscountApplied() +
                "\nTotal Fare Collected: $" + fareCollected);
    }
}
