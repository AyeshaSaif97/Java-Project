package class9;

public class E72DArrays {
    public static void main(String[] args) {


        String[][] names =
                {{"Hind", "Mikhail", "Ismael", "Ahmed"},
                        {"John", "Bob", "Adam", "Tamim"},
                        {"Joke ", "Laugh", "John Ahmed", "Mohammed"},
                        {"Gui", "Backend", "Front", "API"},

                };

        for (String[] row : names) {
            for (String v : row) {
                System.out.print(v + " ");
            }
            System.out.println(

            );
        }
    }
}
//Sout (Array.deepToString(names)); //for printing 2D Arrays