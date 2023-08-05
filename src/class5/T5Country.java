package class5;

import java.util.Scanner;

public class T5Country {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter Country");
        String country = input.nextLine();

        switch (country) {
            case "Canada":
                System.out.println("French");
                break;
            case "Pakistan":
                System.out.println("Urdu");
                break;
            case "UK":
                System.out.println("English");
                break;
            case "UAE":
                System.out.println("Arabic");
                break;
            case "Spain":
                System.out.println("Spanish");

            default:
                System.out.println("Wrong country");


        }
    }
}
