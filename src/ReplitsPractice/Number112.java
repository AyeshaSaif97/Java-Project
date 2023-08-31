package ReplitsPractice;

public class Number112 {
    /*
    For you to do:

1. Create a method in which you will be printing numbers from 1 to 10

2. Call the method in the main method
     */


    void PrintingNumbers(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        Number112 obj = new Number112();
        obj.PrintingNumbers();
    }
}
