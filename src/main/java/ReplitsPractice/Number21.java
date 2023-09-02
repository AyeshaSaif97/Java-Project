package ReplitsPractice;

import java.util.Scanner;

public class Number21 {
    public static void main(String[] args) {
        /*
**For you to do:**
Write a program that asks the user's age: "Enter your age  "
Then display it by adding 10 (i.e age + 10) in your final output.
**Example Output:**
Enter your age 30
Your age after 10 years is 40
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        int age1=(age+10);
        System.out.println("Your age after 10 years is " +age1);

    }
}
