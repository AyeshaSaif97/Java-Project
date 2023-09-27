package class23;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList();
        arr.add("Ace");
        arr.add("Habib");
        arr.add("Gulcan");
        System.out.println(arr.get(0));
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains("Ace"));
        System.out.println(arr.contains("sdsd"));
        System.out.println(arr.indexOf("Habib"));
        System.out.println(arr.remove(0));
        System.out.println(arr.remove(2));

        System.out.println(arr);




    }


}
