/******************************************************
 * Kean University - Summer 2024 *
 * Midterm Exam *
 * Author: Anthony Dominguez
 * Course /section: CPS 2231-16*
 *******************************************************/

class Book {

    // initialize variables
    private String title;
    private int numOfPages;
    private double price;
    private int year;


    // track of books read
    public static int numOfBooksRead= 0;


    public Book(){
        this("Unknown " , -1 , 0.99 , 1000);// default constructor
    }

    public Book(String title, int numOfPages, double price, int year) { // overloader constructor
        this.title = title;
        this.numOfPages = numOfPages;
        this.price = price;
        this.year = year;
        numOfBooksRead++;
    }
    // get methods
    public String getTitle() {
        return title;
    }
    public int getNumOfPages() {
        return numOfPages;
    }
    public double getPrice() {
        return price;
    }
    public int getYear() {
        return year;
    }
    // set methods
    public void setTitle(String title) {this.title = title;}
    public void setNumOfPages(int numOfPages) {this.numOfPages = numOfPages;}
    public void setPrice(double price) {this.price = price;}
    public void setYear(int year) {this.year = year;}
    public static int getNumOfBooksRead() {return numOfBooksRead;}
    // to string method
    public String toString() {return "Title: " + getTitle() + "Pages: " + getNumOfPages() + " Price: " + getPrice() + " Year: " + getYear();}
}
public class BookTest {
    public static void main(String[] args) {
        //object created
        Book book1 = new Book();
        Book book2 = new Book("Hunger Games ", 1200 , 24.00 , 2002);
        //printing to console
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println("Number of books read: "+Book.getNumOfBooksRead());

    }
}
