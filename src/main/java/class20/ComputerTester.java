package class20;

public class ComputerTester {
    public static void main(String[] args) {

        Computer[]array={new Apple(),new Lenovo(), new HP(), new Dell()};
        for(Computer c1:array){
            c1.OS();
            c1.memory();
            c1.speed();
            c1.turnOn();
            c1.turnOff();
        }


    }
}
