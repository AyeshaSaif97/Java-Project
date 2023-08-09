package ReplitsPractice;

import java.util.Scanner;

public class Number36 {
    public static void main(String[] args) {
        /*
Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"
and make the comparisons:
- if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
- if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
- if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE"
         */

            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter two strings");
            String word1=scanner.nextLine();
            String word2=scanner.nextLine();
            System.out.println("Please enter two numbers");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            if(number1==number2 && word1.equals(word2)){
                System.out.println("AND");
            }else if (number1==number2 || word1.equals(word2)){
                System.out.println("OR");
            }else if (!(number1 == number2) && !(word1.equals(word2))){
                System.out.println("NONE");
            }






        }



    }
