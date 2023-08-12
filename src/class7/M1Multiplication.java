package class7;

public class M1Multiplication {
    public static void main(String[] args) {


        /*

        Multiplication Table Write a program to print the multiplication table of numbers from 1 to 10 using nested loops.
         */

        for (int i = 1; i <= 10; i++) {


            for (int j = 1; j <=10; j++) {
                System.out.print((i*j) + " ");

            }
            System.out.println();
        }
    }
}