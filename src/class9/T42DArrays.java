package class9;

public class T42DArrays {
    public static void main(String[] args) {

        String[][] cars =
                {{"Lucid", "Cadillac", "Buick"},
                        {"Mercedes", "Audi ", "Porsche"},
                        {"Hyundai ", "KIA", "Genesis"},
                        {"Ferrari", "Lamborghini", "Maserati"},
                };


        for (String[] r : cars) {
            for (String c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println("====================================");
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("=======================================");

    }
}


