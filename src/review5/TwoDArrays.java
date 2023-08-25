package review5;
public class TwoDArrays {
    public static void main(String[] args) {
        /*
        2D arrays collection of rows and columns
        2D Array is a collection one 1D Array
        12,13,14,15
        1,2,3,4
         */
int [][] array=new int[2][4];
        array[0][0]=12;
        array[0][1]=13;
        array[0][2]=14;
        array[0][3]=15;
        //2 row
        array[1][0]=1;
        array[1][1]=2;
        array[1][2]=3;
        array[1][3]=4;

        System.out.println(array[0][3]); //15

        //how to get all elements from 2D array?
        //array.length in 2D Array returns number of rows
        //array[row].length in 2D array returns number of column from that row

        for (int i = 0; i < array.length ; i++) { //outer loop iterates over rows
            for (int j = 0; j <array[i].length ; j++) { //column

                System.out.print(array[i][j]+" "); // inner loop iterates over the columns
            }
            System.out.println();
        }
    }
}
