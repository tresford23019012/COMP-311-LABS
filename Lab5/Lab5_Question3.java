// TRESFORD CHIPILI 23019012
// QUESTION 3: CREATING OBJECTS

public class Lab5_Question3 {
    public static void main(String[] args) {
        Book book1 = new Book("When Rain Clouds Gather", "Bessie Head", 189);
        Book book2 = new Book("The No. 1 Ladies Detective Agency", "Alexander McCall Smith", 215);

        System.out.println("The first book is " + book1.getTitle() + " by " + book1.getAuthor() + ", priced at P" + book1.getPrice() + " ");   // getters, fields are private
        System.out.println("The second book is " + book2.getTitle() + " by " + book2.getAuthor() + ", priced at P" + book2.getPrice() + " ");
    }
}