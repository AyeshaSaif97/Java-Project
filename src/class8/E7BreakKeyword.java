package class8;

public class E7BreakKeyword {
    public static void main(String[] args) {

        //you have to search the array for number 45 it is present in the array
        //print found
        int[] num = {10, 23, 25, 56, 45, 20};

        for (int n : num) {

            if (n == 45) {
                System.out.println("found");
                break;


            }
        }
    }
}