package class5;

import java.util.Scanner;

public class T10CalculatorSwitchStatement {
    public static void main(String[] args) {
        /*
        Using scanner class create calculator.
        Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
Please complete this assignment in 2 ways: using if statement and switch case.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        double a = input.nextDouble();
        System.out.println("Enter a number");
        double b = input.nextDouble();
        System.out.println("Enter the operator");
        char op = input.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
            default:
                System.out.println("wrong data");
        }


    }
}
