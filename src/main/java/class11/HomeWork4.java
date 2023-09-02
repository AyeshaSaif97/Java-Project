package class11;

public class HomeWork4 {
    public static void main(String[] args) {
/*
How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
 */
        String input = "This is sentence I want to reverse";
        String[] words = input.split("\\s+");
        //    \\s = splits into array
        String reversed = "";

        for (String word : words) {
            String reversedWord = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            reversed += reversedWord + " ";
        }
        System.out.println(reversed.trim());
    }
}