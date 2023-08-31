package ReplitsPractice;

public class Number114 {
    /*
    **For you to do :**

Step1: Create three methods that will accept 2 in parameters on integer type
Step2: Write the logic in methods to perform actions below:
The first method for multiplication
The second method for addition
The third method for subtraction
Step3: execute all methods
1. for the addition method add two numbers to make 30
2. for multiplication multiply two numbers to make 30
3. for Subtraction subtract two numbers to equal 20
**Expected Output:**
Addition 30
Multiplication 30
Subtraction 20
     */
    void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
    }

    void addition(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }

    void subtraction(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(result);
    }



    public static void main(String[] args) {
        Number114 obj = new Number114();
        obj.multiply(10,3);
        obj.addition(10,20);
        obj.subtraction(30,10);

}}
