public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public boolean dropOffPassengers(int numOut) {
        if (numOut > getPassengers()) {
            return false;
        } else {
            dropOffSet(numOut);
            return true;
        }
    }

    public void applyDiscount() {
        if (!discountApplied && electric) {
            discountToll();
            discountApplied = true;
        }
    }

    public void printCar() {
        System.out.println("CAR DATA:" +
                "\nLiscense Plate: " + getLicensePlate() +
                "\nToll Fee: $" + getTollFee() +
                "\nNumber of Passengers: " + getPassengers() +
                "\nElectric: " + electric +
                "\nDiscount Applied: " + discountApplied);
    }
}