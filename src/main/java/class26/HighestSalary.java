package class26;

import java.util.Collections;
import java.util.HashMap;

/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
 */
public class HighestSalary {
    public static void main(String[] args) {
        HashMap<String,Integer> employee= new HashMap<>();
        employee.put("Ayesha Saif",10000000);
        employee.put("Abi Alghas",1009000);
        employee.put("Steve Rogers",90000019);
        employee.put("John Smith",100000);

      Integer maxSalary=(Collections.max(employee.values()));
      var entries= employee.entrySet();
      for(var e: entries){
          if(e.getValue()==maxSalary){
              System.out.println(e.getKey()+" = $"+e.getValue());
          }
      }


    }
}
