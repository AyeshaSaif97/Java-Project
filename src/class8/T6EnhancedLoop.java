package class8;

public class T6EnhancedLoop {
    public static void main(String[] args) {

        //find the largest even number
        int[] nums = {10, 77, 25, 56, 60, 20};

        int largest = nums[0];
        for (int n : nums) {

            if (n % 2 == 0&&n>largest) {
                largest=n;


            }

        }
        System.out.println(largest);

    }
}








