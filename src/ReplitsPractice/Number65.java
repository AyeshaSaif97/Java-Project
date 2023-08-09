package ReplitsPractice;

import java.util.Scanner;

public class Number65 {
    public static void main(String[] args) {
        /*
          Given the following inputs:
int x;
Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("In: ");
        int x = scanner.nextInt();

        for (int i = x - 1; i >= 0; --i) {
            System.out.print(i + " ");
        }
    }


}

