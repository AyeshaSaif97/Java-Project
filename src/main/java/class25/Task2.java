package class25;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {


        TreeSet<String> countries= new TreeSet<>();
        countries.add("Canada");
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Brazil");
        countries.add("UK");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("France");
        countries.add("Italy");
        countries.add("Egypt");

        System.out.println(countries);
        System.out.println("************************");

        countries.forEach(x-> System.out.println(x));

        System.out.println("**************************");

        for(String c:countries){
            System.out.println(c);
        }






    }
}
