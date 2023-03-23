public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;

    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getTollFee() {
        return tollFee;
    }

    public int getPassengers() {
        return passengers;
    }

    public void dropOffSet(int num) {
        passengers -= num;
    }

    public void discountToll() {
        tollFee /= 2;
    }

    public double calculateTollPrice() {
        return tollFee * passengers;
    }
}