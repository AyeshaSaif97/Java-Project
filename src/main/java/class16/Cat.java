package class16;

public class Cat {

    private String name;
    private int age;
    private double weight;
    private String color;
    private String breed;
    private char gender;



    public Cat(){
    }

    public Cat(String name, int age, double weight) {
        //call to the constructor should be the first line
        this.name = name;
        this.age=age;
        this.weight=weight;
    }

    public Cat (String name, int age, double weight, String color){
        this(name,age,weight);
        this.color=color;
    }

    public Cat (String name, int age, double weight, String color, String breed){
        this(name, age, weight, color);
        this.breed=breed;
    }


    public Cat(String name, int age, double weight, String color, String breed, char gender) {
        this(name,age,weight);
        this.color=color;
        this.breed=breed;
        this.gender=gender;

    }

    public void printInfo() {
        System.out.println(name + " " + age + " " + weight + " " + color + " " + breed + " " + gender);}
    }







