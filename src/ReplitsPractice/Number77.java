package ReplitsPractice;

import java.util.Scanner;

public class Number77 {
    public static void main(String[] args) {
        /*
        **For you to do:**

Create an array of integers that will store 5 elements taken from a user

Don't print any prompt message for the user

Then print out all the elements you have created in the first loop in reverse order.
         */
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter numbers");
            nums[i] = scanner.nextInt();

        }
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);

        }


    }
}


