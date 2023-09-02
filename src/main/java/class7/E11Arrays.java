package class7;

public class E11Arrays {
    public static void main(String[] args) {
//creating array and also initializing it right away

        String[] fruit = {"Apple", "Orange", "Banana", "Kiwi", "Pineapple"};

        fruit[3]="Mango";

        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }
    }
}
