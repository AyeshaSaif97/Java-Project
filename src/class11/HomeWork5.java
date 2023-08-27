package class11;

public class HomeWork5 {
    public static void main(String[] args) {
        /*
        How would you check if String is palindrome or not? aba=> true
Abbc =>false
         */

        String str = "noon";
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("Its not a palindrome");

        }


    }
}
