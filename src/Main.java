import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        /* The Book class consists of variables such as book name, page count, author's name, and publication date.
        Create 10 objects from the Book class and store them in an ArrayList structure. Use the stream structure and
        lambda expressions to create a new Map<String, String> where the author's name corresponds to the book name.

         */

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("New Book 1", 250, "Author 1", "1/1/2023"));
        books.add(new Book("New Book 2", 350, "Author 2", "2/1/2023"));
        books.add(new Book("New Book 3", 200, "Author 3", "3/1/2023"));
        books.add(new Book("New Book 4", 400, "Author 4", "4/1/2023"));
        books.add(new Book("New Book 5", 150, "Author 5", "5/1/2023"));
        books.add(new Book("New Book 6", 300, "Author 6", "6/1/2023"));
        books.add(new Book("New Book 7", 180, "Author 7", "7/1/2023"));
        books.add(new Book("New Book 8", 280, "Author 8", "8/1/2023"));
        books.add(new Book("New Book 9", 220, "Author 9", "9/1/2023"));
        books.add(new Book("New Book 10", 320, "Author 10", "10/1/2023"));


        Map<String, String> booksMap = new TreeMap<>();
        books.stream().forEach(book -> booksMap.put(book.getBookName(), book.getAuthorName()));

        /*
        Implement an enhancement that filters books from this list of 10 Book items with more than 100 pages and returns it as a new list.
        (You can use Stream and Lambda expressions.)
         */

        ArrayList<Book> books100 = new ArrayList<>();

        books.stream().filter(book -> book.getPageNumber() > 100).forEach(book -> books100.add(book));
        books100.stream().forEach(book -> System.out.println(book.getBookName()));

    }
}
