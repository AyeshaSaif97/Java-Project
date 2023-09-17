package class22;

public interface MoveAble {
//public static final are interface
//no instance fields, no constructor, no instance methods allowed
    int age=10;// by default public static final
    void move();
    void method1();
}

interface Washable{
    void wash();
    void method1();
}

class Dog implements MoveAble,Washable{
    @Override
    public void move() {
        System.out.println("Dogs can jump run and can move");
    }

    @Override
    public void method1() {
        System.out.println("Doesnt matter");
    }

    @Override
    public void wash() {
        System.out.println("You can safely wash a dog");
    }
}

class Car implements MoveAble,Washable{
    @Override
    public void move() {
        System.out.println("Car can move forward, backwards and can go in circles");
    }

    @Override
    public void method1() {
        System.out.println("doest matter either");
    }

    @Override
    public void wash() {
        System.out.println("You can wash a car");
    }
}
