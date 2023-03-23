public class VehicleRunner {
    public static void main(String[] args) {
        // -------------- LAB PART 1 -----------------
        // a. write code to create a Vehicle object with license "MC56WQ",
        //    toll fee of 10.75, and 5 passengers.
        //    Print out the calculated toll TollPrice.
        Vehicle a = new Vehicle("MC56WQ", 10.75, 5);
        System.out.println(a.calculateTollPrice());
        System.out.println();

        // b. write code to create an electric Car with license "KXN73F",
        //    toll fee of 8.50, and 2 passengers.
        //    Print out the calculated toll price
        Car b = new Car("KXN73F", 8.50, 2, true);
        System.out.println(b.calculateTollPrice());
        System.out.println();

        // c. add a printCar() void method to the Car class that prints the
        //    Car's license plate, toll fee, number of passengers, whether it is electric,
        //    and whether a discount has been applied.
        //    Add getter methods as necessary to the Vehicle superclass.
        //
        // d. call the method on the Car you made in b to test it.
        b.printCar();
        System.out.println();

        // e. write code to create a Truck with license "3K9JMX",
        //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
        //    Print out the calculated toll price
        Truck e = new Truck("3K9JMX", 24.75, 4, 6, true);
        System.out.println(e.calculateTollPrice());
        System.out.println();

        // f. add a printTruck() void method to the Truck class that prints the
        //    Truck's license plate, toll fee, number of passengers, number of axles,
        //    and whether it has a trailer.
        //    Add getter methods as necessary to the Vehicle superclass.
        //
        // g. call the method on the Truck you made in e to test it.
        e.printTruck();
        System.out.println();

        System.out.println("------------ LAB PART 2 ---------------");
        // ----- instructions in lab sheet -------
        Taxi two = new Taxi("8KM23Z", 9.25, 3, true, 5.00);
        two.printTaxi();
        System.out.println(two.getLicensePlate());
        System.out.println(two.getTollFee());
        System.out.println(two.getPassengers());
        System.out.println(two.calculateTollPrice());
        System.out.println(two.isElectric());
        System.out.println(two.isDiscountApplied());
        System.out.println(two instanceof Taxi);
        System.out.println(two instanceof Car);
        System.out.println(two instanceof Vehicle);

        // ------------ LAB PART 3 ---------------
        // ----- instructions in lab sheet -------
        System.out.println("--- Testing method on a Car object ---");
        Car testCar1 = new Car("KXN73F", 8.50, 5, true);
        testCar1.applyDiscount();
        System.out.println(testCar1.isDiscountApplied());
        System.out.println(testCar1.getTollFee());
        System.out.println("-----------");
        testCar1.applyDiscount(); // try applying again
        System.out.println(testCar1.isDiscountApplied());
        System.out.println(testCar1.getTollFee());
        System.out.println("--- Testing method on Taxi objects ---");
        Taxi testTaxi1 = new Taxi("JMD645", 10.0, 3, false, 5.0); // not electric
        testTaxi1.applyDiscount();
        System.out.println(testTaxi1.isDiscountApplied());
        System.out.println(testTaxi1.getTollFee());
        System.out.println("-----------");
        Taxi testTaxi2 = new Taxi("ABC645", 12.0, 3, true, 5.0);
        testTaxi2.applyDiscount();
        System.out.println(testTaxi2.isDiscountApplied());
        System.out.println(testTaxi2.getTollFee());
        System.out.println("-----------");

    }
}