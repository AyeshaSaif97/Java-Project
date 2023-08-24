package class10;

public class Student {
    //student-- Properties/Attributes
    String name;
    int age;
    String id;

    //void = methods/functions/behaviors
    void study() {
        System.out.println("Studying 16 hours a day . . . . . . . . . .");


    }

    public static void main(String[] args) {
        //line # 17 we are creating an actual student by using the Student class
        Student ehabObj = new Student();
        ehabObj.name = "Ehab"; //property to assi gn// any functions
//name of the class + any variable name
        ehabObj.age = 23;
        ehabObj.id = "abc123";
        ehabObj.study();


        Student habibObj=new Student ();
        habibObj.name="Habib";
        habibObj.age=20;
        habibObj.id="abd123";
        habibObj.study();
    }
}
