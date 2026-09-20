// TRESFORD CHIPILI 23019012
// QUESTION 8: COMPARING OBJECTS

public class Question8 {
    public static Book cheaperBook(Book a, Book b) {   // static so main can call it directly
        if (a.getPrice() < b.getPrice()) {
            return a;
        }
        return b;                                  // a tie returns b (question doesn't specify)
    }

    public static void main(String[] args) {
        Book book1 = new Book("When Rain Clouds Gather", "Kathryn Chipili", 189.50);
        Book book2 = new Book("The No. 1 Ladies' Detective Agency", "Alexander McCall Smith", 215.00);

        System.out.println("The cheaper book is: " + cheaperBook(book1, book2).getSummary());
    }
}