package ReplitsPractice;

public class Number61 {
    public static void main(String[] args) {
        /*
        **For you to do:**

Write a program that uses for loop to prints multiplication of  number 3 from 1 to 10
**Expected Output:**
3*1=3
3*2=6
         */
        int number = 3;
        for (int i =1 ; i <= 10 ; i++) {
            int result= number*i;
            System.out.println(number + "*" + i + "=" +result);
        }
    }
}
