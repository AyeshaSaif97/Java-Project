package class24;

import java.util.ArrayList;

public class T5 {
/*
Create an arrayList of fruit then remove all the fruit which
contains the letter a or ends with the letter e
 */
public static void main(String[] args) {
    ArrayList <String> fruits= new ArrayList<>();
    fruits.add("Mango");
    fruits.add("Kiwi");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Apple");
    fruits.add("Watermelon");
    fruits.add("Peach");

    System.out.println("Before "+fruits);

    fruits.removeIf(x->x.contains("a")||x.endsWith("e"));
    System.out.println("After " +fruits);






}


}
