package review7;

public class SuperHeroes {

    String name, power;
    int age;
    char gender;

    SuperHeroes(String name, String power) {
        this.name = name;
        this.power = power;
    }

    SuperHeroes(String name, String power, int age) {
        this(name, power); //this () making a call to the CURRENT class constructor
        this.age = age; // this. -> accessing current class instance variables
    }

    SuperHeroes(String name, String power, int age, char gender) {
        this(name, power, age);
        this.gender = gender;
    }

    void printInfo() {
        System.out.println(name + " " + power + " " + age + " " + gender);
    }

    public static void main(String[] args) {
        SuperHeroes hero1 = new SuperHeroes("Superman", "Fly");
        hero1.printInfo();
        SuperHeroes hero2 = new SuperHeroes("Batman", "Money", 27);
        hero2.printInfo();
        SuperHeroes hero3 = new SuperHeroes("Thor", "Super Human Strength", 1500, 'M');
        hero3.printInfo();


    }


}
