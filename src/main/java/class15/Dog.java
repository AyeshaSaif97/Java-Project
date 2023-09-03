package class15;

public class Dog {

    private String name;
    private String breed;
    private String color;
    private int age;

    //why we need instance above? so we can store data and share data
    //whenever we use static we dont need to create object of the class.
    //why we make them private? so no one can change it and for security reasons
    //that is why we have constructors
    //no written type for constructor
    //following is a constructor'//for constructor we don't need void
    //constructor helps to filter out information
    //best practice to use with private
    //below is an example of constructor
    //void is not used with constructor
    //constructors have same name as class name
    public Dog(String dName, String dBreed, String dColor, int dAge) {
        name = dName;
        breed = dBreed;
        color = dColor;
        age = dAge;

    }



   public void bark(){
        System.out.println("wuff wuff . . . . ");}


   public void printInfo(){
    System.out.println(name+" "+breed+" "+color);

    }

}