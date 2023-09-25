package class26;

import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> students= new LinkedHashMap<>();
        students.put(1,"Adam");
        students.put(2,"Ehab");
        students.put(3,"Marta");
        students.put(4,"Ahmed");
        students.put(5,"Abi");
        students.put(6,"Ayesha");
        students.put(7,"Deepali");
        students.put(8,"Madina");
        students.put(9,"Nafiseh");
        students.put(10,"Tamim");
        students.put(11,"Adrian");
        students.put(12,"Uzair");
        students.put(13,"Alina");
        System.out.println(students);
        students.remove(4);
        students.remove(8);
        System.out.println(students);
        students.replace(10,"Jamel");
        System.out.println(students);


    }
}
