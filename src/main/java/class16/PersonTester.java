package class16;

public class PersonTester {
    public static void main(String[] args) {

        Person p1 = new Person("Fahim", 26, 86, 'M');
        p1.printInfo();

        Person p2 = new Person("Mikhail", 26, 12000, 'M',0,"Bold");
        p2.printInfo();

        Person p3=new Person();
        p3.printInfo();

    }
}
