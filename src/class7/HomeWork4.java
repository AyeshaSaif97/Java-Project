package class7;

public class HomeWork4 {
    public static void main(String[] args) {
        /*
        Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

         */

        String[] cars = {"Mercedes", "BMW", "Toyota", "Honda", "Hyundai", "KIA", "Mazda"};

        int i = 0;
        while (i < cars.length) {
            System.out.println(cars[i]);


            i++;
        }
        System.out.println();

        //another method

        String[] carss = {"Mercedes", "BMW", "Toyota", "Honda", "Hyundai", "KIA", "Mazda"};

        for (int j = 0; j < cars.length; j++) {
            System.out.println(carss[j]);

        }
    }
}