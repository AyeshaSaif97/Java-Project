package class20;

/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
 */
public class Computer {

    public void memory() {
        System.out.println("Computer memory is small");
    }
    public void speed() {
        System.out.println("Computer speed is moderate");
    }
    public void OS(){
        System.out.println("Operating system is windows");
    }

    public void turnOn(){
        System.out.println("Computer turns on");
    }

    public void turnOff(){
        System.out.println("Computer turns off");
    }
}

class Apple extends Computer{

    public void OS(){
        System.out.println("Operating System is IOS");}
}

class Lenovo extends Computer{
    public void speed(){
        System.out.println("Computer speed is fast");
    }
}

class HP extends Computer{
    public void memory(){
        System.out.println("Computer memory is small");
    }
}

class Dell extends Computer{
    public void speed(){
        System.out.println("Computer speed is very fast");
    }

}














