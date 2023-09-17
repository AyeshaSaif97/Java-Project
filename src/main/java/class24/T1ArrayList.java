package class24;

import java.util.ArrayList;

public class T1ArrayList {
    public static void main(String[] args) {
/*
Create an ArrayList that will store 5 names into it.
• Find out whether the given ArrayList is empty or not?
• Check whether the specific name is present in an ArrayList or not?
• Find the size of your arrayList and print all values from that
 */
        ArrayList<String> names= new ArrayList<>();
        names.add("Ayesha");
        names.add("Abi");
        names.add("Deepali");
        names.add("Jamel");
        names.add("Ehab");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Ayesha"));
        System.out.println(names.size());
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }






    }


}
