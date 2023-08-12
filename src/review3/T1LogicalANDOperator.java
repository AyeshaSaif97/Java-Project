package review3;

import java.util.Scanner;

public class T1LogicalANDOperator {
    public static void main(String[] args) {
/*
Ask the user to input two boolean values (true or false).
Use the logical AND operator (&&) to determine if both are true.
Display the result to the user.
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you stay workout");
        boolean value1= scanner.nextBoolean();
        System.out.println("Do you stay on a diet?");
        boolean value2= scanner.nextBoolean();
        System.out.println(value1&&value2);
        System.out.println();
/*another way of doing it
        //if(value1&&value2){
        System.out.println("Both values are true);
        } else{
         System.out.println("Both values are not true);




 */
    }
}
