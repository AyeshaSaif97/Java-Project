package class4;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        // You are a loan specialist and
        // you need to ask user what is the amount of loan is needed.
        // if loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
        Scanner scanner = new Scanner(System.in);
        System.out.println(("What is the loan amount that you want?"));
        double loan = scanner.nextDouble();
        if (loan<= 200000) {
            System.out.println("You will be approved for the loan");
        } else {
            System.out.println("You are not approved for the loan");

        }

    }
}

