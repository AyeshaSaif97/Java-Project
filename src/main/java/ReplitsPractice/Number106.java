package ReplitsPractice;

public class Number106 {
    public static void main(String[] args) {


    /*
    # For you to do
Instantiate and StringBuffer class
Append Value "Hello" to it
Append value "World" to it.
Print in UPPERCASE.
**Expected Output:**
HELLO WORLD
     */

        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        String result = sb.toString().toUpperCase();
        System.out.println(result);

    }
}