package class18;

public class Bike {

    protected String make;
    String model;




    public Bike(){}
    public Bike(String make, String model){
        this.make=make;
        this.model=model;
    }

    public void display(){
        System.out.println(make+" "+model);
    }


}
