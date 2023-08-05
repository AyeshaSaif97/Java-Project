package class5;

import java.util.Scanner;

public class T1BirthMonth {
    public static void main(String[] args) {
        //Write a program for user to enter his/hers birth month. Based on the month define the season.
        //Example: if user is born in March, April, May → season =”Spring”
        //if user is born in June, July, August →
        //season =”Summer”  etc …
        //At the end of the program we should see 1 output as “You were born is season __”.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Birth Month");
        String month = input.nextLine();

        if (month.equalsIgnoreCase("march") || month.equalsIgnoreCase("april") || month.equalsIgnoreCase("may")) {
            System.out.println("You were born in Spring");
        } else if (month.equalsIgnoreCase("june") || month.equalsIgnoreCase("july") || month.equalsIgnoreCase("august")) {
            System.out.println("You were born in Summer");
        } else if (month.equalsIgnoreCase("september") || month.equalsIgnoreCase("october") || month.equalsIgnoreCase("november")) {
            System.out.println("You were born in Fall");
        } else if (month.equalsIgnoreCase("december") || month.equalsIgnoreCase("january") || month.equalsIgnoreCase("february")) {
            System.out.println("You were born in Winter");
        } else {
            System.out.println("Wrong month");
        }
    }


}
