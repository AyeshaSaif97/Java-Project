package ReplitsPractice;

public class Number98 {
    public static void main(String[] args) {
        /*
        **For you to do:**
Create a String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"
**Expected Output:**
Welcome Syntax family
         */

        String given ="Hello Syntax friends";
        System.out.println(given.replaceAll("Hello","Welcome").replaceAll("friends","family"));

    }
}


