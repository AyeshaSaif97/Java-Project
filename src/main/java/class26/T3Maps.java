package class26;

import java.util.TreeMap;

public class T3Maps {
    public static void main(String[] args) {
        /*
        Create a map of countries(5) with its capital that will store countries in alphabetical order.
         Country names will be keys and capitals will be values
         Print all keys and values from a country map using for each loop or Lambda.
        Print all values from a country map using for each loop or Lambda.
        Only print those countries which contain more than 5 letters in their country name and the letter 'a' in their capital names
         */
        TreeMap<String,String> countries= new TreeMap<>();
        countries.put("Canada","Ottawa");
        countries.put("USA","Washington DC");
        countries.put("France","Paris");
        countries.put("Germany","Berlin");
        countries.put("Egypt","Cairo");

     countries.forEach((k,v)->{
         if(k.length()>5&&v.contains("a")){
             System.out.println(k+" "+v);

         }
        });
    }
}

