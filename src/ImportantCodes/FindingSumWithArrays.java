package ImportantCodes;

public class FindingSumWithArrays {
    public static void main(String[] args) {
        /*
        create an array store 5 numbers in it and print all the numbers from the array
         */

        int[] numbers = {20, 10, 50, 30, 40};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];//pick the previous value of sum and add it to current value of array
        }
        System.out.println(sum);
    }
}


