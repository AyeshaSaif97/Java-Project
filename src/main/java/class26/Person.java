package class26;

import java.util.TreeMap;

/*
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object.
Print each object details.
Example of key is 1 , 2 ,3 etc.
 */
public class Person {

    private String name;
    private String lastName;
    private int age;
    private int salary;

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }


    void printInfo() {
        System.out.println("First Name: " +name + " Last Name: " + lastName + " Age: " + age + " Salary: " + salary);
    }
}

    class PersonTester{
        public static void main(String[] args) {
            TreeMap<Integer,Person> personMap= new TreeMap<>();
            Person p1= new Person("Ayesha","Saif",25,80000);
            Person p2=new Person("Abi","Alghas",30,90000);
            Person p3= new Person("Steve","Rogers",35,100000);

            personMap.put(1,p1);
            personMap.put(2,p2);
            personMap.put(3,p3);

            personMap.forEach((k,v)->{
                System.out.println("ID "+k);
                v.printInfo();

            });




        }
    }



