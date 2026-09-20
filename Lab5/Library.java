// TRESFORD CHIPILI 23019012
// QUESTION 9: A CLASS THAT USES ANOTHER CLASS

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;                 // list grows as books are added

    public Library() {
        books = new ArrayList<Book>();             // must be created or addBook would crash on null
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void printAllBooks() {
        if (books.isEmpty()) {                     // clear message instead of silent nothing
            System.out.println("The library has no books yet.");
            return;
        }
        System.out.println("The library currently holds " + books.size() + " books:");
        for (Book b : books) {
            System.out.println("- " + b.getSummary());
        }
    }
}