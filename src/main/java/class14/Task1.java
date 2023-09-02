package class14;

public class Task1 {


    int calculateSum(int[] array){
        int sum=0;
        for (int num :array){
            sum =sum+ num;

        }return sum;
    }




    public static void main(String[] args) {
        int [] myArray={1,2,3,4,5};
        Task1 obj= new Task1();
        int sum=obj.calculateSum(myArray);
        System.out.println("Sum of array :" +sum);
    }

    }