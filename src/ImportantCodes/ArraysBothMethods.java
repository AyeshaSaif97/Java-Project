package ImportantCodes;

public class ArraysBothMethods {
    public static void main(String[] args) {


        String[] fruit = {"Apple", "Orange", "Banana", "Kiwi", "Pineapple"};
        System.out.println(fruit.length); //gives us the number of items in the array
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        int [] prices= new int[5];
        prices[0]=1000;
        prices[2]=250;


        System.out.println(prices[2]);

    }

}
