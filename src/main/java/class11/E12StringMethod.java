package class11;

public class E12StringMethod {
    public static void main(String[] args) {
        //  String str="HI#There#how#are#you";
        String str="HI There how are you";
        String[] strArr=str.split("\\s");
        System.out.println(strArr.length);
        System.out.println(strArr[1]);
    }
}

