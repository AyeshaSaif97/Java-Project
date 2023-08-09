package ReplitsPractice;

import java.util.Scanner;

public class Number64 {
    public static void main(String[] args) {
        /*
        **For you to do:**
You should input:
int end;
Write a for loop that will print out a series of numbers starting at 0 and ending at the doubled value of end(value must be taken from a user), exclusive.
Each number should be on the same line, separated by a space.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        for (int i = 0; i < number * 2; i++) {
            System.out.print(i + " ");
        }
    }
}