package Practicing;

public class T1NestedLoops {
    public static void main(String[] args) {
        /*
        1
        12
        123
        1234
        12345
        123456
         */

        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(j);
            }  System.out.println();
        }


    }
}



