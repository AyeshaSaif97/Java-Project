package class15;

public class Students {
    /*
    write a java class students that have a constructor which takes student name and 3 subject grades.
    inside your class also have a method to calculate average grade.
    test student class for 2 different students with different marks.
     your program should print an average mark of each students name
     */

    private String name;
    private double marks1;
    private double marks2;
    private double marks3;


    public Students(String sName, double sMarks1, double sMarks2, double sMarks3) {
        name = sName;
        marks1 = sMarks1;
        marks2 = sMarks2;
        marks3 = sMarks3;

    }

    public void printAvg() {
        double avg = 0;
        avg = (marks1 + marks2 + marks3) / 3.0;
        System.out.println(name + " Got " + avg);
    }

    public void printName(){
        System.out.println(name);

    }
}
