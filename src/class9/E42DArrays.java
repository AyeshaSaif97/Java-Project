package class9;

public class E42DArrays {
    public static void main(String[] args) {
        //print only even numbers from this array
        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 400},
                {16, 20, 32, 22}};

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
