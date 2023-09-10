package class20;

public class StudentTester {
    public static void main(String[] args) {
        Student[] arr = {new Student(), new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].homework();
            arr[i].study();
            arr[i].play();
            arr[i].extraCurricular();

        }

    }
}
