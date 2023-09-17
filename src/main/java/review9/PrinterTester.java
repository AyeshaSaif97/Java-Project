package review9;

import java.util.Scanner;

public class PrinterTester {
    public static void main(String[] args) {

        Printer p = new Printer();
        p.print();
        p.print("java");
        p.print(54);
        p.print("Ayesha",25);
        p.print(33,"Abi");
        p.print(45.0);
        p.print(10,20,40,50);
        p.print(23,5,543,7654,466);
        p.print(5,2,43,6,4,2,3,7);


        System.out.println(Math.abs(5));
        Scanner scanner= new Scanner(System.in);
        scanner.nextByte();
        scanner.nextByte(2);
        String str=String.valueOf(100);
        System.out.println(str);




    }
}
