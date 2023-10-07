package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exceptions {
    public static void main(String[] args) {
        System.out.println("1");
        int num1=10;
        int num2=0;
        if(num2!=0){
            System.out.println(num1/num2);
        }

       // System.out.println(10/0); //runtime exception
       // int [] arr=new int[-5]; //runtime exception

        try {
            FileInputStream f=new FileInputStream("C//33242");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        //FileInputStream f=new FileInputStream("C//sdds");
        //Thread.sleep(2000); //checked exception


    }
}
