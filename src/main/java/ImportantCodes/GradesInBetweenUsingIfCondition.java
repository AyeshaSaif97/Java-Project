package ImportantCodes;

import java.util.Scanner;

public class GradesInBetweenUsingIfCondition {

    //Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
//if the average score >=90 → grade=A
//if the average score >= 70 and <90 → grade=B
//if the average score>=50 and <70 → grade=C
//if the average score<50 → grade=F
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your quiz score");
        double quizScore = input.nextDouble();
        System.out.println("Please enter your mid term score");
        double midTerm = input.nextDouble();
        System.out.println("Please enter final score");
        double finalScore = input.nextDouble();
        double averagescore = (quizScore + midTerm + finalScore) / 3;

        if (averagescore >= 90) {
            System.out.println("grade A");
        } else if (averagescore >= 70 && averagescore <= 90) {
            System.out.println("grade B");
        } else if (averagescore >= 50 && averagescore < 70) {
            System.out.println("grade C");
        } else if (averagescore < 50) {
            System.out.println("grade F");
        } else {
            System.out.println("You have failed");
        }


    }
}
