package review2;

import java.util.Scanner;

public class E5IfElseScanner {
    public static void main(String[] args) {


        /*
        if age is greater than 60 offer 20% discount
        if the age is greater than 50 offer 15% discount
        if age is greater than 40 offer 10%

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scanner.nextInt();
        if(age>60){
            System.out.println("Discount is 20%");
        }else if(age>50){
            System.out.println("Discount is 15%");
        }else if(age>40){
            System.out.println("Discount is 10%");
        }else{
            System.out.println("No discount for you. Please try after 10 years");
        }
    }
}
