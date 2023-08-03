package class4;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        //Create a Java program that will ask user to input city and temperature.
        // Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your city");
        String city= scanner.nextLine();
        System.out.println("Enter the temperature");
        double temperature= scanner.nextDouble();
        double convert= (temperature-32)*5/9;
        System.out.println("The temperature in " +city+" "+" is "+convert);








    }

}
