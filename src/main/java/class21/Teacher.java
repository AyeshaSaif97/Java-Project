package class21;

public class Teacher {
    String name;
    String lastname;
    int age;
    public Teacher( String name,String lastname, int age){
        this.name=name;
        this.lastname=lastname;
        this.age=age;
    }
}
class Student1 extends Teacher{
    int grade;
    public Student1(String name,String lastname,int age,int grade){
        super(name,lastname,age);
        this.grade=grade;
    }
    void printinfo(){
        System.out.println(name+" "+lastname+" "+age+" "+grade);
    }
}
class admin extends Teacher{
    int grade;
    String address;
    public admin(String name,String lastname,int age,int grade,String address){
        super(name, lastname, age);
        this.grade=grade;
        this.address=address;

    }
    void printinfo(){
        System.out.println(name+" "+lastname+" "+age+" "+grade+" "+address);
    }
}

