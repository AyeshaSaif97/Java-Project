package class9;

public class E22DArrays {
    public static void main(String[] args) {


        String[][] names =
                {       {"Hind", "Mikhail", "Ismael", "Ahmed"},
                        {"John", "Bob", "Adam", "Tamim"},
                        {"Joke ", "Laugh", "John Ahmed", "Mohammed"},
                        {"Gui", "Backend", "Front", "API"},

                };

       // System.out.println(names[2][2]);
        //System.out.println(names[1][3]);

       String[] row=names[2];
        ////System.out.println(row[0]);
        //System.out.println(Arrays.toString(firstRow));


       for(String name: row ){
           System.out.println(name);
            
        }


    }
}
