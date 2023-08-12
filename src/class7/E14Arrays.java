package class7;

public class E14Arrays {
    public static void main(String[] args) {
        /*
        create an array store 5 numbers in it and print all the numbers from the array
         */

        int[] numbers = {20, 29, 48, 69, 60};


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }

        }


    }


}