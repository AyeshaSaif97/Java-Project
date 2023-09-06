package class17;

public class X {
    /*
    Write program for multilevel inheritance where class Z inherits from class Y and Class Y inherits from Class X.
     */
    String name;
    void printName(){
        System.out.println(name);
    }
}

class Y extends X{
    String lastname;
    void printLastName(){
        System.out.println(lastname);

    }

}
class Z extends Y {
    int age;

    void printAge(){
        System.out.println(age);
    }

}

