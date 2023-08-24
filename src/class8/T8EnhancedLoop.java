package class8;

public class T8EnhancedLoop {
    public static void main(String[] args) {
//iter for enhanced loop
        //go to the array and replace all the negative numbers with 0
        int[] nums = {10, 77, 25, 56, 60, 20, -10, -5};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
            System.out.println(nums[i]);
        }
    }
}
/*
another way of doing this = reduce the computation (time complexity)
for (int num : nums) {
     System.out.println(num);
 */

