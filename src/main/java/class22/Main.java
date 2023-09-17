package class22;



class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Joe", "Smith", 35, 35000);
        employee.printInfo();

        Tester1 tester = new Tester1("Adam", "Smith", 15, "Java");
        tester.printInfo();
    }
}

class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printInfo() {
        System.out.print(firstName + " " + lastName + " " + age+" ");
    }
}

class Employee extends Person {
    int salary;

    public Employee(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(salary);
    }
}

class Tester1 extends Person {
    String programmingLanguages;

    public Tester1(String firstName, String lastName, int age, String programmingLanguages) {
        super(firstName, lastName, age);
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(programmingLanguages);
    }
}

