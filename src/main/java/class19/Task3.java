package class19;

public class Task3 {

    private void print(){
        System.out.println("Hello ! Program 3 Private Method Overloading ");
    }
    private void print(String name){
        System.out.println("Hello  My name is : "+name);
    }
    private void print(double Salary ){
        System.out.println("And My salary is "+ Salary);
    }

    public static void main(String[] args) {
        Task3 obj=new Task3();
        obj.print();
        obj.print("Deepali");
        obj.print(1200000);

    }
}