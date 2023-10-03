package review11;

import java.util.ArrayList;
import java.util.List;

public class E7ArrayList {
    public static void main(String[] args) {

        List<String> fruit= new ArrayList<>();
        fruit.add("Apple"); //0
        fruit.add("Mango"); //1
        fruit.add("Orange"); //2
        fruit.add("Kiwi"); //3
        fruit.add("Banana"); //4
        fruit.add("Cherry"); //5
        fruit.add("Apple"); //6


        fruit.replaceAll(x-> {
            if (x.contains("a")) {
                return "water";
            }else{
                return x;
            }
        });
        System.out.println(fruit);

    }
}
