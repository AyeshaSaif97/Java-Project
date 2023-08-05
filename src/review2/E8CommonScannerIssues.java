package review2;

import java.util.Scanner;

public class E8CommonScannerIssues {
    public static void main(String[] args) {

//next method can only handle one word from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Full Name");
        String fName = scanner.nextLine();
        System.out.println("Please Enter your City");
        scanner.nextLine(); // to consume the enter press
        String city = scanner.nextLine();
        System.out.println(fName + " " + city);


    }}