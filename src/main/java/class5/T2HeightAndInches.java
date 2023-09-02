package class5;

import java.util.Scanner;

public class T2HeightAndInches {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in inches");
        double height = input.nextInt();
        if (height < 60) {
            System.out.println("short");
        } else if (height > 60 && height < 72) {
            System.out.println("Medium");
        } else {
            System.out.println("tall");
        }
    }
}