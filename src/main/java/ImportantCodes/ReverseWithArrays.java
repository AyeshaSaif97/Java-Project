package ImportantCodes;

public class ReverseWithArrays {
    public static void main(String[] args) {
/*
Create an array to store char values and then print those in reverse order
 */
        char[] letters = {'A', 'B', 'C', 'D'};

        for (int i = 3; i>=0 ; i--) {
            System.out.print(letters[i]);
        }

        System.out.println("----------------------------");
        char [] chars={'A','b','c','F','#','@'};

        for (int i = chars.length-1; i >= 0 ; i--) {
            System.out.print(chars[i]);

        }



    }
}
