package class4;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
//You are DMV representative and you need to ask customer their age.
// If they are 18 and older you will issue a driver license to them, otherwise you will offer them to get a learners permit.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Age");
        int age=scanner.nextInt();



        if(age>=18){
            System.out.println("Your driver license will be issued");
        } else {
            System.out.println("We will offer you to get a learner's permit");
        }
    }
    }
