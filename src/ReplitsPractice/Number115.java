package ReplitsPractice;

public class Number115 {
    /*
    Create a method that will accept a String as a parameter and return new String all in upper case
Call method
**Expected Output:**
TEST
     */
    String word1(String word){
        return word.toUpperCase();


    }

    public static void main(String[] args) {
        Number115 obj = new Number115();
        System.out.println(obj.word1("Ayesha"));
    }

}
