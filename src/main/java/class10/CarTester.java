package class10;

public class CarTester {
    public static void main(String[] args) {

        Car CarObj = new Car();
        CarObj.make = "Hyundai";
        CarObj.model = "Elantra";
        CarObj.year = 2017;
        CarObj.color = "Premium Grey";
        CarObj.cartype = "sedan";
        System.out.println(CarObj.make);
        System.out.println(CarObj.year);
        System.out.println(CarObj.model);
        System.out.println(CarObj.color);
        CarObj.moveForward();
        CarObj.applyBrakes();

        System.out.println("===========================");

        Car Car1 = new Car();
        Car1.make = "Tesla";
        Car1.model = "X";
        Car1.year = 2023;
        Car1.color = "Premium Grey";
        Car1.cartype = "SUV";
        System.out.println(Car1.make);
        System.out.println(Car1.year);
        System.out.println(Car1.model);
        System.out.println(Car1.color);
        Car1.moveForward();
        Car1.applyBrakes();


    }
}
