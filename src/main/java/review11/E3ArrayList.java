package review11;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Ali"); //0
        names.add("Jamel"); //1
        names.add("Rai"); //2
        names.add("Aya"); //3
        names.add("Aya");
        System.out.println(names.size());

        System.out.println(names.get(0));
       //System.out.println(names.remove(1)); //fast
        System.out.println(names.remove("Aya"));
        System.out.println(names.remove("Jamel")); //slow //false if element is removed, true if element is present
        System.out.println(names.contains("Jamel"));
        System.out.println(names.contains("Jamila"));

        names.removeIf(x->x.equals("Aya"));
        System.out.println(names);
    }
}
