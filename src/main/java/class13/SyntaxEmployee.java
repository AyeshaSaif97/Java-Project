package class13;

public class SyntaxEmployee {
    String empID;
    int salary;
    static String CEO = "Sumair";




    public static void main(String[] args) {
        SyntaxEmployee t1= new SyntaxEmployee();
        t1.empID="5421AS";
        t1.salary=90000;

        System.out.println("Employee ID: "+t1.empID);
        System.out.println("Salary: "+t1.salary);
        System.out.println("CEO " +SyntaxEmployee.CEO);

        SyntaxEmployee t2= new SyntaxEmployee();
        t2.empID="5421AA";
        t2.salary=76000;

        System.out.println("Employee ID: "+t2.empID);
        System.out.println("Salary: "+t2.salary);
        System.out.println("CEO " +SyntaxEmployee.CEO);













    }


}
