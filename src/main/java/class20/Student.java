package class20;

public class Student {



    void homework() {
        System.out.println("Student is doing homework");
    }



    void study() {
        System.out.println("Student is studying");
    }

    void play() {
        System.out.println("Student likes to play Chess");
    }

    void extraCurricular() {
        System.out.println("Student likes to do extra curricular activites");
    }
}


    class SyntaxStudent extends Student {
        void play() {
            System.out.println("Student likes to play cards");
        }
    }



    class CollegeStudent extends Student {
        @Override
        void extraCurricular() {
            System.out.println("Student likes to nap instead");

        }
    }

    class SchoolStudent extends Student {
        @Override
        void homework() {
            System.out.println("Student doesnt like to do homework, instead likes to chill all day");
        }

    }


