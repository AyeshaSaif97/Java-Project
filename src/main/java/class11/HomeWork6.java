package class11;

public class HomeWork6 {
    public static void main(String[] args) {
        /*
        How would you swap  2 strings without a temporary variable?
         */

        String word1 = "Ayesha";
        String word2 = "Saif";

        System.out.println("Before Swapping =");
        System.out.println("First String is: " + word1);
        System.out.println("Second String is: " + word2);
        word1 = word1 + word2;
        word2 = word1.substring(0, word1.length() - word2.length());
        word1 = word1.substring(word2.length());
        System.out.println("After Swapping =");
        System.out.println("First String is: " + word1);
        System.out.println("Second String is: " + word2);


    }
}
