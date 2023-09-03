package class15;

public class StudentsTester {
    public static void main(String[] args) {

        new Students("Ayesha", 89, 91, 90).printAvg();
        new Students("Abi", 89, 95, 90).printAvg();


        Students s1= new Students("student",87,90,86);
        s1.printAvg();
        s1.printName();

        Students s2= new Students("student",87,90,86);
        s2.printAvg();



    }
}