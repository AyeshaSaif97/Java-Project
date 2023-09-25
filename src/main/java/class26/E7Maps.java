package class26;

import java.util.ArrayList;

public class E7Maps {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        //new ArrayList<>(); => Creating the object of the ArrayList class
        names.add("Avis");
        names.add("Adam");
        names.add("John");
        names.add("James");


        ArrayList<ArrayList<String>> arrayLists=new ArrayList<>();
        arrayLists.add(names);
        System.out.println(names);

    }
}
