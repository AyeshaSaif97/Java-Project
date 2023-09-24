package class25;

import java.util.HashSet;

public class E7HastSet {
    public static void main(String[] args) {
        //set

        HashSet<String> fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Banana");
        System.out.println(fruit);
        //no duplicate
        //no insertion order
        //u cant use get in sets because random index
        //only can use enhanced loop
        //using lambda
        //direct print
        fruit.forEach(x-> System.out.println(x));
        System.out.println("********************");
        for(String f:fruit){
            System.out.println(f);
        }
    }
}
