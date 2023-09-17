package class24;

import java.util.ArrayList;

public class T4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");

/*
        for (int i = words.size() - 1; i >= 0; i--) {
            String word = words.get(i);
            if (word.endsWith("e")) {
                words.remove(i);
           }
        }
 */
        words.removeIf(x->x.endsWith("e"));  //remove if expects logic whether a certain element should be removed from the array list or not
        System.out.println(words);
    }
}












