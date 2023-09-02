package class10;

public class E8StringDemo {
    public static void main(String[] args) {

        String str = "Today is a Java Class";
        System.out.println(str.startsWith("T"));
        System.out.println(str.startsWith("Today"));
        System.out.println(str.startsWith(" Today"));   //space is also counted
        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("Class"));


    }
}
