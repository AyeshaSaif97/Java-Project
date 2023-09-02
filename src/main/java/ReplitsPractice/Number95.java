package ReplitsPractice;

import java.util.Scanner;

public class Number95 {
    public static void main(String[] args) {
        /*
        **For you to do:**

Using Scanner class input string value.

Print out the following: "The first 3 letters of \_\_\_ is ___"

```
For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
```
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String input= scanner.nextLine();

        if(input.length()>=3){
            String subinput=input.substring(0,3);
                System.out.println("The first 3 letters of "+input+" is "+subinput);
            }else{
                System.out.println("Try again");
            }
        }

    }

