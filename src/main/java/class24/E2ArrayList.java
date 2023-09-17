package class24;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        String[] names1 = {"add", "sss"};
        ArrayList<String> names = new ArrayList<>();
        names.add("Deepali");
        names.add("Ahmed");
        names.add("Mike");
        names.add("John");
        names.add("Ali");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("***************************");
        for (String a : names) {
            System.out.println(a);
        }
        System.out.println("*****************************");

        int i = 0;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
        }

    }
}