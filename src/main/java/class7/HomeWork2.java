package class7;

public class HomeWork2 {
    public static void main(String[] args) {
        /*
Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
         */

        String[] names = {"Ayesha", "Abi", "Ehab", "Giulia", "Artur", "Deepali", "Jamel", "Madina", "Tahmin"};
        System.out.println(names[0]);

        //another method

        String[] namess = new String[9];
        namess[0] = "Ayesha";
        namess[1] = "Abi";
        namess[2] = "Ehab";
        namess[3] = "Giulia";
        namess[4] = "Artur";
        namess[5] = "Deepali";
        namess[6] = "Jamel";
        namess[7] = "Madina";
        namess[8] = "Tahmin";
        System.out.println(namess[0]);
    }


}
