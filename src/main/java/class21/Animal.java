package class21;

public abstract class Animal {


    abstract void speak();

    abstract void sleep();

    abstract void eat();
}


class Dog extends Animal {
    void speak() {
        System.out.println("Wuff Wuff . . .");
    }

    @Override
    void sleep() {
        System.out.println("Sleeping for 10 hours");
    }

    @Override
    void eat() {
        System.out.println("Eating bones . . .");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Meow Meow . . .");
    }

    @Override
    void sleep() {
        System.out.println("Cats sleep for 12-16 hours");
    }

    void eat() {
        System.out.println("Cats like to eat fish");
    }
}