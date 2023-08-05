package review2;

import java.util.Scanner;

public class E4IfElseScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double price= scanner.nextDouble();
        System.out.println("Price is "+price);
        if(price>10000){
            System.out.println("I cant buy this item");
        }else{
            System.out.println("Lets buy it");
        }



    }
}
