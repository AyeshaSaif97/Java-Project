package review7;

public class Book {
    /*
    Syntax of variables
    dataType name;
     */
    String title;
    String author;
    int year;
    double price;

    //static is a class level variable
    static int totalBooks;
    static String type = "AudioBook";

    /*
    .syntax of method
    .method is a block of code which is reusable
    .returnType name
    .void read
    I can create my own methods:
    1. with parameters or without
    2. with return or without

     */
    void read() {
        System.out.println("I am reading " + title + " book by " + author);
    }

    void changePrice(int newPrice) {
        System.out.println("The price of the book " + title + " was changed from " + price + " to " + newPrice);
    }


    //when we want a method to return a price we don't put void in the method
    double totalWithTax(double tax) {
        double total = price + (price * tax);
        return total;
    }
}







