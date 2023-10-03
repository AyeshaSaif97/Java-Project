package review11;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        int [] number=new int[5];
        //what is the data type of number, it is an array of numbers
        ArrayList<Integer> nums=new ArrayList<>(10000);
        //wht is data type of nums, it is an arrayList of Integers
        //generic concept, allows us to use the same class for any data type
        nums.add(10);
        nums.add(15);
        nums.add(45);
        nums.add(50);

        System.out.println(nums);

       nums.remove(new Integer(45));
        System.out.println(nums);


        ArrayList<String> names=new ArrayList<>();
        names.add("Jamil");
        names.add("Artur");
        names.remove("Artur");
        System.out.println(names);







    }
}
