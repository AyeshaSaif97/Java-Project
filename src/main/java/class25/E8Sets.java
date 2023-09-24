package class25;

import java.util.LinkedHashSet;

public class E8Sets {
    public static void main(String[] args) {


        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(10);
        uniqueNumbers.add(30);
        System.out.println(uniqueNumbers);
        //no index no get method here
        //Linked is jst go to keep the order
        //slower than Hashset


    }

}
