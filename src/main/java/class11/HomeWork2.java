package class11;


public class HomeWork2 {
    public static void main(String[] args) {

        /*
        Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphabets(abd AZ) characters are there in the String.
         */

        String comb = "ahsjflls12234574@#@%AANIKNKJDACLAI";
        int upperCount = 0;
        int lowerCount = 0;
        for (char c : comb.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    upperCount++;
                } else {
                    lowerCount++;
                }
            }
        }
        System.out.println("The amount of upper case letters are: " + upperCount);
        System.out.println("The amount of lower case letters are: " + lowerCount);
    }
}