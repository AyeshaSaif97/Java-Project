package class16;

public class Person {
    //Why should we use constructors?
    //1.They help us write more secure classes
    //2.Cleaner code

   private String name;
   private int age;
   private double weight;
   private char gender;



   //if you put void before class name in constructor it becomes a method thats why we cant use void in constructor
   public Person(String pName, int pAge, double pWeight, char pGender){
       name=pName;
       age=pAge;
       weight=pWeight;
       gender=pGender;
   }

   public void printInfo(){
       System.out.println(name+" "+age+" "+weight+" "+gender);
   }


















}
