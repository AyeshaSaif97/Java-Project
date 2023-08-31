package class13;

public class Students {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */


    String name;
    String ID;


    static int number_Of_Students;

    public static void main(String[] args) {
        Students obj= new Students();
        obj.name="Ayesha";
        obj.ID="AS9102";
        number_Of_Students++;

        Students obj1= new Students();
        obj1.name="Abi";
        obj1.ID="AA9102";
        number_Of_Students++;

        Students obj2= new Students();
        obj2.name="Guilia";
        obj2.ID="GM9102";
        number_Of_Students++;

        Students obj3= new Students();
        obj3.name="Jamel";
        obj3.ID="JP9102";
        number_Of_Students++;

        Students obj4= new Students();
        obj4.name="Ehab";
        obj4.ID="EB9102";
        number_Of_Students++;


        System.out.println("Total number of students "+number_Of_Students);



    }

}
