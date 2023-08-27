package class11;

public class E2StringMethods {
    public static void main(String[] args) {

        String str = "Batch 17 is A great batch. Just kidding. Please dont take it seriously";


        int sum = 0;


        for (int i = 0; i < str.length(); i++) {
            // the reason we are not using -1 is because we are writing < less not this <
            //System.out.println(str.charAt(i));

            if (str.charAt(i) == 'a'||str.charAt(i)=='A') {
                sum++;
            }
        }

        System.out.println("A appeared " + sum + " times");


    }
}

