package class15;

public class Car {

    //how things are written in Java
    //1.field
    //2.constructor
    //3.methods

    private String make;
    private String model;
    private String color;
    private double price;

    public Car(String carMake,String carModel, String carColor, double carPrice){
        //initializes instance variables of the class the values a user is going to use as parameters
        make=carMake;
        model=carModel;
        color=carColor;
        price=carPrice;
    }

    public void printInfo(){
        System.out.println(make+" "+model+" "+color+" "+price);
    }

    void setPrice(double carPrice){
        price=carPrice;
    }

    double getPrice(){
        return price;
    }

}
