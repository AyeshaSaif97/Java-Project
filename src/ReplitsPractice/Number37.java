package ReplitsPractice;

import java.util.Scanner;

public class Number37 {
    public static void main(String[] args) {
        /*
**For you to do:*
Take 2 boolean inputs from a user:
"Are you thirsty?"
"Are you sleepy?"
If user is thirsty and not sleepy--> drink=water
If user is thirsty and sleepy--> drink=coffee
If user is not thirsty and sleepy --> drink=tea
Otherwise drink="nothing"
Output:
- Looks like you need to drink
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean isThirsty=scanner.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean isSleepy=scanner.nextBoolean();



        if((isThirsty==true)&&(isSleepy==false)){
            System.out.println("Looks like you need to drink water");
        }else if((isThirsty==true)&&(isSleepy==true)){
            System.out.println("Looks like you need to drink coffee");
        }else if((isThirsty==false)&&(isSleepy==true)){
            System.out.println("Looks like you need to drink tea");

        }else{
            System.out.println("Looks like you need to drink nothing");
        }




    }
}
