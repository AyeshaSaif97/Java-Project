package ReplitsPractice;

import java.util.Scanner;

public class Number38 {
    public static void main(String[] args) {
        /*
**For you to do:**
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="manual testing"
Otherwise --> subject="Java"
**Output**:
Today you will be learning ____
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is it weekend?");
        String weekend=scanner.nextLine();

        if(weekend.equalsIgnoreCase("yes")||weekend.equalsIgnoreCase("true")){
            System.out.println("Today you will be learning Java");
        }else
            System.out.println("Today you will be learning manual testing");
    }


}
