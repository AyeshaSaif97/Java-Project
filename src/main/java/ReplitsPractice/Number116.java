package ReplitsPractice;

public class Number116 {
    /*
    Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
( Return false if one or both given numbers are not even)
Examples:
- bothEven(4,6) ==> true
- bothEven(3,4) ==> false
- bothEven(-1,1) ==> false
**Expected Output:**
false
     */

    boolean numbers(int num1,int num2){
        if(num1%2==0&&num2%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Number116 obj = new Number116();
        System.out.println(obj.numbers(54,21));
    }
}
