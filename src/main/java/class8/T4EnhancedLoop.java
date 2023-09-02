package class8;

public class T4EnhancedLoop {
    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20};

        int largest = nums[0]; //it can be initialized with any numbers from within the array
        for (int n : nums) {

            if (n > largest) {
                largest = n;
            }
        }

        System.out.println(largest);
    }
}








