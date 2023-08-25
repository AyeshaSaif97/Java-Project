package review5;

public class ArrayReview {
    public static void main(String[] args) {
        /*arrays are collection of the same data type
        when to use loops - when we want to repeat a block of code

        when we do not know the exact number of iterations - while or do while

       when we know how many times we want to repeat or iterate the code - for loop

     we use enhanced for loop Only with Arrays of collection, we use them when large collection of data is present


enhanced for/for each loop/advanced for --- loop syntax
     for (DataTypeofElement anyVariableName:NameofTheDataStructure)
         */

        int[] array = {10, 11, 12, 13, 55, 34, 24};


        int numberOfElements = array.length;
        System.out.println(numberOfElements);

        System.out.println(array[3]);


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < array.length; i++) {


            System.out.print(array[i] + " ");
        }



        for (int number:array){
            //using variable to get to the elements
            System.out.println(number);
        }
        }
    }



