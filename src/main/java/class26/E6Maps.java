package class26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E6Maps {
    public static void main(String[] args) {

        ArrayList<Double> priceOfMakeup= new ArrayList<>();
        priceOfMakeup.add(25.5);
        priceOfMakeup.add(30.2);
        priceOfMakeup.add(25.3);

        ArrayList<Double> pricesOfFruits=new ArrayList<>();
        pricesOfFruits.add(2.5);
        pricesOfFruits.add(3.99);
        pricesOfFruits.add(4.99);

        ArrayList<Double> pricesOfDairy= new ArrayList<>();
        pricesOfDairy.add(1.99);
        pricesOfDairy.add(2.99);
        pricesOfDairy.add(3.99);
        pricesOfDairy.add(4.99);

        Map<String,ArrayList<Double>> arrayListMap= new HashMap<>();
        arrayListMap.put("pricesOfMakeup",priceOfMakeup);
        arrayListMap.put("pricesOfFruit",pricesOfFruits);
        arrayListMap.put("pricesOfDairy",pricesOfDairy);


        System.out.println(arrayListMap);



    }


}
