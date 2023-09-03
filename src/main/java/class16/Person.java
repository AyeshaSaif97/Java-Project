package class16;

public class Person {
    //Why should we use constructors?
    //1.They help us write more secure classes
    //2.Cleaner code

    private String name;
    private int age;
    private double weight;
    private char gender;
    private int salary;
    private String hairColor;

    //it's good to have plenty of constructors to have more options
//this keyword does not work with static
//this equals to instance variable
//if you put void before class name in constructor it becomes a method that's why we cant use void in constructor
    public Person() {
    }
    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }
    public Person(String name, int age, double weight, char gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }


    public Person(String name, int age, double weight, char gender, int salary, String hairColor) {
      //call to the constructor should be the first line
        this(name,age,weight,gender);
        this.salary = salary;
        this.hairColor = hairColor;
    }
    public void printInfo() {//local variable have more priority than instance variable
        // String name="Giu";
        System.out.println(name + " " + age + " " + weight + " " + gender + " " + salary + " " + hairColor);
    }
}
