package review12;

import java.util.Scanner;

public class MethodTester {
    public static void main(String[] args) {
       int sum= Methods.add(10,10);
        System.out.println(sum);
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num==2){
            System.out.println("positive number");
        }



    }
}
