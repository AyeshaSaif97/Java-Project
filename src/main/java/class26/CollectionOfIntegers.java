package class26;

import java.util.ArrayList;
import java.util.List;

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class CollectionOfIntegers {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();
        numbers.add(13);
        numbers.add(20);
        numbers.add(50);
        numbers.add(100);
        numbers.add(32);

        int sum=0;

        for(int i: numbers){
            sum=i+sum;

        }
        System.out.println("Sum : "+sum);

    }
}
