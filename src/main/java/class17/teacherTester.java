package class17;

public class teacherTester {
    public static void main(String[] args) {
        teacher t1= new teacher();
        t1.name="Ayesha";
        t1.subject="Biology";
        System.out.println(t1.name);
        System.out.println(t1.subject);
        t1.teach();
        t1.grade();
        t1.talk();
        t1.eat();

        System.out.println("__________________________________");

        MathTeacher m1= new MathTeacher();
        m1.schoolHours=23;
        m1.teach();
        m1.grade();
        m1.talk();
        m1.eat();
        m1.printHours();
        m1.name="Abi";
        m1.subject="Pashto";
        System.out.println(m1.name);
        System.out.println(m1.subject);

        System.out.println("__________________________________");

        ChemistryTeacher c1= new ChemistryTeacher();
        c1.numOfClasses=9;
        c1.teach();
        c1.grade();
        c1.talk();
        c1.eat();
        c1.printClasses();
        c1.name="Hiesenburg";
        c1.subject="Chemistry";
        System.out.println(c1.name);
        System.out.println(c1.subject);

        System.out.println("__________________________________");


        PianoTeacher p1= new PianoTeacher();
        p1.numOfStudents=9;
        p1.teach();
        p1.grade();
        p1.talk();
        p1.eat();
        p1.printStudents();
        p1.name="Harry";
        p1.subject="Piano";
        System.out.println(p1.name);
        System.out.println(p1.subject);













    }
}
