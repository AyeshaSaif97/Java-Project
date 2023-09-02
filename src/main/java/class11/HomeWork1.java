package class11;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        /*
        Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Mom's First Name");
        String momName = scanner.nextLine();
        System.out.println("Enter Dad's First Name");
        String dadName = scanner.nextLine();
        System.out.println("Enter the baby's gender");
        String babyGender = scanner.nextLine();


       if(babyGender.equalsIgnoreCase("boy")) {
          String boysName = dadName.substring(0, dadName.length() / 2) + momName.substring(momName.length() / 2);
           System.out.println(boysName);
       } else if (babyGender.equalsIgnoreCase("girl")) {
           String girlsName= momName.substring(0, momName.length() / 2) + dadName.substring(dadName.length() / 2);
           System.out.println(girlsName);

       }else {
           System.out.println("Invalid output");


       }


        }
    }
