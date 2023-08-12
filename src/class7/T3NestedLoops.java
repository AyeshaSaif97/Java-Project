package class7;

public class T3NestedLoops {
    public static void main(String[] args) {
/*
1 2 3 4 5 6
 */


        int j = 0;
        while (j < 4) {

            int i = 1;
            while (i < 7) {
                if (i != 3)
                System.out.print(i+" ");

                i++;
            }
            System.out.println();
            j++;
        }
    }
}