package class11;

public class HomeWork3 {
    public static void main(String[] args) {
        /*
You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
How would you find out how many sentences are in that String?
         */


        String special="Is it saturday? Is it raining? Do we have a Java Class today?";
        String []array=special.split("[?]");
        System.out.println(array.length);
    }
}
