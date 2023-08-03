package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please Enter your name");
        //class written by java developers
        //creating the object of the Scanner class so that
        // we can reuse the logic from this class which is already written for us by Java developers
        Scanner scanner=new Scanner(System.in);
        //taking an input from the user and storing in int a name variable
        String name = scanner.next();
        if(name.equals("Asghar")){
            System.out.println(("Java Instructor"));
        }else{
            System.out.println("I dont know you");
        }
        //System.out.println("Hello "+name);


    }
}


