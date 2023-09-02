package class9;

public class E62DArrays {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};

        for (int i = 0; i <= 3; i++) {
            System.out.println(numbers[0][i]);
            System.out.println(numbers[i][1]);
            System.out.println(numbers[1][i]);
            System.out.println(numbers[2][i]);


        }
    }
}
