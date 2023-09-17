package class24;

public class E5BoxingUnBoxing {
    public static void main(String[] args) {

        int a=10;
        Integer number= new Integer(a);
        int d=number.intValue(); //converting from a class to a primitive // old ways
        System.out.println(d);


        //new ways are listed below

        Integer c=10;

        int f=c;
        System.out.println(f);


    }
}
