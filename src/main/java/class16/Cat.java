package class16;

public class Cat {

    private String name;
    private String breed;
    private int age;
    private String color;
    private char gender;
    private String eyeColor;


    public Cat() {
    }

    public Cat(String name, String breed, int age) {
        //call to the constructor should be the first line
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Cat(String name, String breed, int age, String color, char gender, String eyeColor) {
        this(name, breed, age);
        this.color = color;
        this.gender = gender;
        this.eyeColor = eyeColor;
    }

    public void printInfo() {
        System.out.println(name + " " + breed + " " + age + " " + color + " " + gender + " " + eyeColor);
    }


}





