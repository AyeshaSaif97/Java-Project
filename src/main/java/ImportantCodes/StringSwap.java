package ImportantCodes;

public class StringSwap {
    public static void main(String[] args) {
     /*
        How would you swap  2 strings without a temporary variable?
         */

        String str1 = "Ayesha";
        String str2 = "Saif";
        System.out.println("First string :" +str1);
        System.out.println("Second string :" +str2);
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        System.out.println("After swapping");
        System.out.println("Second string "+str2);
        str1=str1.substring(str2.length());
        System.out.println("First string "+str1);

    }
}
