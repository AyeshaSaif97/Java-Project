package class26;

import java.util.TreeMap;

public class E11Maps {
    public static void main(String[] args) {


        TreeMap<String, Double> makeUp = new TreeMap<>();
        makeUp.put("Lipsticks", 22.0);
        makeUp.put("BlushOn", 40.0);
        makeUp.put("Base", 50.0);
        makeUp.put("Foundation", 90.0);
        makeUp.put("EyeLiner", 25.5);
        makeUp.put("EyeLiner", 30.5);
        makeUp.put("Concealer", 35.5);

       // makeUp.entrySet().removeIf(x->x.getKey().contains("a"));

       // makeUp.entrySet().removeIf(x->x.getValue()>30);

        makeUp.entrySet().removeIf(x->x.getKey().contains("a")&&x.getValue()>30);
        System.out.println(makeUp);

    }
}
