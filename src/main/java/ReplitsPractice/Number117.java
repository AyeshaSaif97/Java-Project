package ReplitsPractice;

public class Number117 {
    /*
    Create a method with the following specs:
Returns:
an integer
Name:
sumEvenToX
Parameters:
an integer called "x"
Purpose:
calculate the sum of the EVEN integers from 1 to x (including x)
Examples:
sumEvenToX(5) ==> 6
sumEvenToX(8) ==> 20
     */
    static int sumEvenTox(int x) {
        //2 4 6 8 10
    int sum = 0;
        for (int i = 2; i <= x; i=i+2) {
            sum=sum+i;
        }
        return sum;


    }

    public static void main(String[] args) {
        Number117 obj = new Number117();
        System.out.println(obj.sumEvenTox(10));
    }
}




