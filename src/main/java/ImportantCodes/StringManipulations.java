package ImportantCodes;

public class StringManipulations {
    public static void main(String[] args) {
        //measures length
        String obj2="My Dog";
        int len=obj2.length(); //calling the length method/function/actions/behaviour
        System.out.println(len);

        System.out.println("------------------------------");
            //letters to upper and lower case
        String name = "MADINA";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());


        System.out.println("++++++++++++++++++++++++++++++++++");
        //adding both names
        String nom = "Artur";
        String nom2 = "Madina";
        System.out.println(nom + " " +nom2); //Mostly this is used

        System.out.println("+++++++++++++++++++++++++++++++++++");

        //checking if its string is empty returns a boolean
        String n="";
        System.out.println(n.isEmpty());

        System.out.println("+++++++++++++++++++++++++++++++++++");

        String e="           USA          ";
        //Going to remove all the spaces before and after the String
        System.out.println(e.trim());

        System.out.println("+++++++++++++++++++++++++++++++++++");


        //checks if string starts with and ends with the provided input returns a boolean
        String str = "Today is a Java Class";
        System.out.println(str.startsWith("T"));
        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("Class"));

        System.out.println("+++++++++++++++++++++++++++++++++++");

        //checks if the sentence contains the word or letter
        String str1 = "Today is a Java Class";
        System.out.println(str1.contains("Java"));

        System.out.println("+++++++++++++++++++++++++++++++++++");

        //checks if both sentences or words are same or night

        String na = "James";
        String na2 = "JAmes";
        System.out.println(na.equals(na2));
        System.out.println(na.equalsIgnoreCase(na2));



    }
}
