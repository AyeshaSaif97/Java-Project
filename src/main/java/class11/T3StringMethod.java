package class11;

public class T3StringMethod {
    public static void main(String[] args) {



       // String str= "Hi#There#how#are#you";
        String str= "Hi There how are you";
        String [] strArr=str.split("\\s");
        System.out.println(strArr.length);
        System.out.println(strArr[1]);


    }
}
