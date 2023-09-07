package class17;

import class18.Bike;

public class HondaBike extends Bike {

    void printModel(){
        System.out.println(make);

    }
}


class Tester{
    public static void main(String[] args) {
        HondaBike hb= new HondaBike();
        hb.printModel();



        Bike b= new Bike("Honda","2023");
        b.display();


    }
}