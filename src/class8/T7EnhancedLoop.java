package class8;

public class T7EnhancedLoop {
    public static void main(String[] args) {

        int [] nums={10,77,25,56,60,20,-10,-5};
        int smallest = nums[0]; //it can be initialized with any numbers from within the array
        for (int n : nums) {

            if (n < smallest) {
                smallest = n;
            }
        }

        System.out.println(smallest);
    }
}

