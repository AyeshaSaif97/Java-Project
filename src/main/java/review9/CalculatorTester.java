package review9;

public class CalculatorTester {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.add(10, 20);

        int result = c.add(10, 20, 30);

        System.out.println(result);


    }
}
