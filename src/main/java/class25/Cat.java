package class25;

import java.util.LinkedList;

public class Cat {
    /*
    Create a Cat class create 3 fields a constructor and and printInfo method inside it.
    Create three objects from this class store them inside the Linkedlist and
    call printInfo method using these three objects.
     */

    private String catName;
    private String catBreed;
    private int catAge;

    public Cat(String catName, String catBreed, int catAge) {
        this.catName = catName;
        this.catBreed = catBreed;
        this.catAge = catAge;
    }

   public void printInfo() {
        System.out.println("Name: "+catName);

        System.out.println("Breed: "+catBreed);
        System.out.println("Age: "+catAge);

    }
}

class Tester {
    public static void main(String[] args) {
        LinkedList<Cat> cats = new LinkedList<>();
        cats.add(new Cat("Lucy", "Persian", 3));
        cats.add(new Cat("Lily", "Persian", 5));
        cats.add(new Cat("Lesi", "Munchkin", 2));

       cats.forEach(x->x.printInfo());
    }
}