package review13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exceptions {
    public static void main(String[] args) throws FileNotFoundException {


        System.out.println(1);
        System.out.println(2);
        try {
            FileInputStream fileInputStream = new FileInputStream("akssk");
        } catch (FileNotFoundException e){
            System.out.println("My alternate code as well");
       e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e);
        }
        System.out.println(3);
        System.out.println(4);

    }}
