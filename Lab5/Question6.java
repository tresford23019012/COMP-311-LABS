// TRESFORD CHIPILI 23019012
// QUESTION 6: AN ARRAY OF OBJECTS

public class Question6 {
    public static void main(String[] args) {
        Book[] books = new Book[3];                // three empty slots, each still needs new Book(...)
        books[0] = new Book("When Rain Clouds Gather", "Quest Mokweso", 189.50);
        books[1] = new Book("Far and Beyond", "Unity Dow", 165.00);
        books[2] = new Book("The No. 1 Ladies Detective Agency", "Peter J Smith", 215.00);

        for (int i = 0; i < books.length; i++) {   // length avoids a hard-coded 3
            System.out.println("Book " + (i + 1) + ": " + books[i].getSummary());
        }
    }
}