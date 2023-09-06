package class17;

public class E {
    /*
    Write program to inherit class E that has method printF which is static and call or reuse that method into class F
     */

    static String name="Jamel";

    static void printF(){
        System.out.println("hello world");
    }
}

class F extends E{
    public static void main(String[] args) {
        printF();
        System.out.println(name);
    }

}


