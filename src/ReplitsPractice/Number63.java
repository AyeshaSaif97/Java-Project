package ReplitsPractice;

import java.util.Scanner;

public class Number63 {
    public static void main(String[] args) {
        /*
        Given the following inputs:
int x;
Write a for loop that will print out a series of numbers starting at 0 and ending at the x(value must be taken from a user), exclusive.
**Example Output:**
In: 3
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("In: ");
        int x = scanner.nextInt();


        for (int i = 0; i < x; i++) {
            System.out.print(i + " ");
        }

    }
}
