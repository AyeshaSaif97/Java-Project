package class12;

public class HomeWork3 {
    /*
    Create a method that will print whether given String is palindrome or not.
     */

    String palindrome(String word1){

        String reverse="";

        for (int i = word1.length()-1; i >= 0; i--) {
            reverse = reverse + word1.charAt(i);
        }

        if (word1.equals(reverse)) {
            return word1 + " it is a palindrome ";
        } else {
            return word1 + " it is not a palindrome";

        }





    }


}
