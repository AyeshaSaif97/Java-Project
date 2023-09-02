package class7;

public class HomeWork6 {
    public static void main(String[] args) {
        /*
        Create an array on integers and calculate the sum of all elements in an array
         */

        int[] numbers = {500, 100, 550, 330, 4240};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
