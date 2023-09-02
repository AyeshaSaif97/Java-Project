package class10;

public class E2StringDemo {
    public static void main(String[] args) {
//spaces are counted
        String name = "Madina @#";
        if (name.length() < 8) {
            System.out.println("Name not allowed");
        }
        System.out.println(name.length());


    }
}
