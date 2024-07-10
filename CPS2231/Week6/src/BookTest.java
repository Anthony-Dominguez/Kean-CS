class Book {
  private String title;
  private String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public String getTitle() {
    return title;
  }
  public String getAuthor() {
    return author;
  }
  public String toString() {
    return "Book title: " + title + "\n" + "Author: " + author;
  }
}
class Library {
  private String name;
  private Book [] book; // composition!!

  public Library(String name, Book[] book) {
    this.name = name;
    this.book = book;
  }

  public String getName() {
    return name;
  }
  public Book[] getBook() {
    return book;
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Library name: ").append(name).append("\n");

    for (Book b : book) {
      sb.append(b.toString()).append("\n");
    }
    return sb.toString();
  }
}



public class BookTest {
  public static void main(String[] args) {
    Book book1 = new Book("Java Programming", "John Doe");
    Book book2 = new Book("Python Programming", "Jane Doe");
    Book book3 = new Book("C Programming", "Jack Doe");
    Book[] books = {book1, book2, book3};
    Library library = new Library("Library of Congress",books);
    System.out.println(library);
  
  }
}
