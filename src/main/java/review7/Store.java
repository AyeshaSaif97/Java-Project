package review7;

public class Store {

    public static void main(String[] args) {


        //new keyword creates an object//
        System.out.println(Book.type); //right way of accessing static variables by the class name

        Book book1 = new Book();
        book1.title = "NightWork";
        book1.author = "Irwin Shaw";
        book1.year = 1975;
        book1.price = 45;
        book1.type="Hard Copy"; //not the right way of accessing static variables
        //book1.page=299; CE(compiler error):Variable does not exist in book class

        book1.read();
        book1.changePrice(41);
        double total = book1.totalWithTax(0.1);
        System.out.println("The price with taxes = " + total);


        //new Magazine(); - we dont have a magazine class so we cannot create an object of that class

        Book book2= new Book();
        book2.title="Atomic Habits";
        book2.author="James Clear";
        book2.year=2018;
        book2.price=15;
        System.out.println(book2.type); //now all books become hard copies




    }

}
