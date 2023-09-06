package class16;

public class Book {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */

    private String bookName;
    private String bookTitle;

    private String bookAuthor;

    private int bookPrice;

    public Book(String bookTitle){
        this.bookTitle=bookTitle;
    }

    public Book(String bookTitle, String bookAuthor, int bookPrice){
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.bookPrice=bookPrice;
    }

    public void printInfo(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Book titile is "+bookTitle+ "\n" +
                "The book Author is: "+bookAuthor+ "\n" +
                "The book price is: "+bookPrice);

    }

}
