package class24;

import java.util.ArrayList;

public class T2ArrayList {
    public static void main(String[] args) {

        ArrayList <String> cars= new ArrayList<>();
        cars.add("Elantra");
        cars.add("Optima");
        cars.add("Lambo");
        cars.add("Mclaren");
        cars.add("Ferrari");

        for (int i = 0; i <cars.size() ; i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("*********************");

        for (String car : cars) {
            System.out.println(car);
        }









    }
}
