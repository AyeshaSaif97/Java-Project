package review2;

import java.util.Scanner;

public class E7CommonScannerIssues {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//next method can only handle one word from the console

        System.out.println("What city are you in?");
        String city=scanner.nextLine();
        System.out.println("What is the temperature in that city in fahrenheit?");
        double fahrenheit=scanner.nextDouble();
        double celsius=(fahrenheit-32)*5/9;
        System.out.println("The temperature in "+city+" is "+celsius);

    }
}