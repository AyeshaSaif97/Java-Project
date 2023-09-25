package class25;

import java.util.HashSet;

public class Student {

        /*
        Create a Set that will hold Objects of Student Type.
         In this set we do not care about the insertion order.
         Each student object should have name and studentID.
          Display name of each student.
         */

     private String studentName;
     private int studentID;

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public static void main(String[] args) {
        HashSet<Student> students= new HashSet<>();
        students.add(new Student("Ayesha",5346));
        students.add(new Student("Abi",54225));
        students.add(new Student("Deepali",54463));
        students.add(new Student("Jamel",56678));

        students.forEach(student -> System.out.println(student.getStudentName()));



    }


}

