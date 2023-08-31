package ReplitsPractice;

import java.util.Scanner;

public class Number104 {
    public static void main(String[] args) {
    /*
    **For you to do:**
Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.
Input Example:
John
Expected Output:
**Joh**
     */
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Please enter names");

        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();

            if (names[i].length() >= 3) {
                String subinput = names[i].substring(0, 3);
                System.out.println(subinput);
            } else {
                System.out.println("Name is too short");
            }
        }


    }
}
