// TRESFORD CHIPILI 23019012
// QUESTION 10: PUTTING IT TOGETHER

public class Question10 {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("When Rain Clouds Gather", "Kathryn Chipili", 189.50));
        library.addBook(new Book("Far and Beyond", "Unity Dow", 165.00));
        library.addBook(new Book("The No. 1 Ladies' Detective Agency", "Peter J Smith", 215.00));
        library.addBook(new Book("Head First Java", "Kathy Sierra", 450.00));

        library.printAllBooks();
    }
}