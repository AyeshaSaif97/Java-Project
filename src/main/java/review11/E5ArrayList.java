package review11;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {

        ArrayList <String> fruit= new ArrayList<>();
        fruit.add("Apple"); //0
        fruit.add("Mango"); //1
        fruit.add("Orange"); //2
        fruit.add("Kiwi"); //3
        fruit.add("Banana"); //4
        fruit.add("Cherry"); //5
        fruit.add("Apple"); //6

       fruit.set(2,"Grapes"); // replaces the value at the index
        System.out.println(fruit);

        System.out.println(fruit.isEmpty());
        System.out.println(fruit.indexOf("Apple")); //it shows index of first Element
        System.out.println(fruit.lastIndexOf("Apple")); //shows the last index of the duplicate element

    }
}
