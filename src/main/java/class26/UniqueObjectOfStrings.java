package class26;

import java.util.TreeSet;

/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
public class UniqueObjectOfStrings {
    public static void main(String[] args) {

        TreeSet<String> people= new TreeSet<>();
        people.add("Ayesha");
        people.add("Abi");
        people.add("Ehab");
        people.add("Deepali");
        people.add("Jamel");
        people.add("Tahmin");
        people.add("Madina");
        people.add("Artur");
        people.add("Guilia");
        people.add("Laura");


        people.forEach(x-> System.out.print(x+" "));

    }
}
