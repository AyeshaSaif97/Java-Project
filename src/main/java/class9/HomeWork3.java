package class9;

public class HomeWork3 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        Develop a program which will identify/print the even numbers only.
         */

        int[][] numbers = {
                {7, 18, 12, 26},
                {5, 10, 16, 4},
                {97, 205, 911}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) { //numbers[row] => gives us the complete ID Array

                if (numbers[row][col] % 2 == 0) {
                    System.out.print(numbers[row][col] + " ");
                }

            }
            System.out.println();

        }
    }
}


