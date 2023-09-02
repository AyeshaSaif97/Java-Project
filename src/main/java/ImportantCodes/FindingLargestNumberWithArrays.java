package ImportantCodes;

public class FindingLargestNumberWithArrays {
    public static void main(String[] args) {
/*

From an array of integer elements find the largest number.
 */
        int[] numbers = {500, 100, 550, 330, 4240};

        int largest = numbers[0];

        for(int i = 1; i< numbers.length; i++){
            if(numbers[i] >largest){
                largest = numbers[i];
            }
        }
        System.out.println(largest);

    }
}
