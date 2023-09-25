package class26;

import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {

        TreeMap<Integer, String> BestBuy = new TreeMap<>();
        BestBuy.put(7664847,"Printer");
        BestBuy.put(7879885,"TV");
        BestBuy.put(7987421,"Laptop");
        BestBuy.put(7682911,"Juicer");

        var entries=BestBuy.entrySet();
        for(var e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println("*********************");
        System.out.println("With Lambda");

        BestBuy.forEach((k,v)-> System.out.println(k+" "+v));


    }
}
