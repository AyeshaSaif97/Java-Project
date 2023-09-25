package class26;
/*
   Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.
    */
public class JavaProject6 {
    public static char firstNonRepeatingChar(String str) {
        char[] cArr = str.toCharArray();
        for (char currentChar : cArr) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (currentChar == c) {

                    count++;
                }
            }
            if (count == 1) {
                return currentChar;
            }
        }
        return 0;
    }


    public static void main(String[] args) {

    }}