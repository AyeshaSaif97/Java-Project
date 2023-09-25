package class26;

import java.util.HashMap;

public class E1Maps {
    public static void main(String[] args) {

        //type casting does not work with Wrapper Classes like Double, Integer,Byte you to have manually convert an int to double
        //you cant have duplicates
        //8.0 is overrided and last value will be printed
        //length or size
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",8.0);
        fruit.put("Banana",3.0);
        fruit.put("Orange",5.2);
        fruit.put("Kiwi",6.5);
        fruit.put("Apple",4.0);
        System.out.println(fruit);
        System.out.println(fruit.size());
        System.out.println(fruit.containsKey("Apple"));
        System.out.println(fruit.containsValue(4.0));
        System.out.println(fruit.containsValue(44));
        System.out.println(fruit.isEmpty());
























    }
}
