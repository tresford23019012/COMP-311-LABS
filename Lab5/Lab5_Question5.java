// TRESFORD CHIPILI 23019012
// QUESTION 5: ENCAPSULATION

public class Lab5_Question5 {
    public static void main(String[] args) {
        Book book = new Book("Head First Java", "Kathyrn Chipili", 450.00);
        System.out.println("Before: " + book.getSummary());

        book.setPrice(399.99);                     // setters are the only way to change private fields
        book.setTitle("Head First Java, 3rd Edition");

        System.out.println("After: " + book.getSummary());
    }
}