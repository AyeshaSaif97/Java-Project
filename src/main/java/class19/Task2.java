package class19;

public class Task2 {

    /*
    Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
     */

    public static void print(){
        System.out.println("Java is great");}

    public static void print(String word){
        System.out.println("Java is "+word);}

    public static void number(float num1, float num2, float num3){
        System.out.println("Numbers");
    }

//static means it belongs to the class, constructor are specifically used for instance variables


    public static void main(String[] args) {
        print();
        print(" Amazing");
        number(12,34,65);
    }








}