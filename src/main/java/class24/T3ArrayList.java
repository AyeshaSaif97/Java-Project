package class24;

import java.util.ArrayList;

/*
Create an arrayList of drinks call it. If any drink has letter “a”
or “e” replace the whole word with water.
 */
public class T3ArrayList {
    public static void main(String[] args) {

        ArrayList <String> drinks = new ArrayList<>();
        drinks.add("Pepsi");
        drinks.add("Coke");
        drinks.add("7Up");
        drinks.add("Sprite");
        drinks.add("Canada Dry");

        System.out.println(drinks);

        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if (drink.contains("a") || drink.contains("e")) {
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
        }
    }






