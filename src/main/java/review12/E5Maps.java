package review12;

import java.util.HashMap;
import java.util.Map;

public class E5Maps {
    public static void main(String[] args) {

        Map<String, Double> studentMarksMap = new HashMap<>();
        studentMarksMap.put("Habib", 95.5);
        studentMarksMap.put("Madina", 95.5);
        studentMarksMap.put("Artur", 89.5);
        studentMarksMap.put("Nelson", 97.5);
        System.out.println(studentMarksMap);

   //  Set<Map.Entry<String, Double>> entries = studentMarksMap.entrySet();


        //converted a map into a set of Entries containing key value pairs

        //alt enter
       var entrySet=studentMarksMap.entrySet();
       entrySet.removeIf(x->x.getKey().contains("e")||x.getValue()<90);

        System.out.println(studentMarksMap);





    }
}