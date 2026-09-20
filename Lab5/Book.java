// TRESFORD CHIPILI 23019012
// QUESTIONS 1, 2, 4 AND 5: BOOK CLASS

public class Book {
    private String title;                          // private for encapsulation (Q5)
    private String author;
    private double price;

    public Book(String title, String author, double price) {   // Q2
        this.title = title;                        // this. separates field from parameter
        this.author = author;
        this.price = price;
    }

    public String getSummary() {                   // Q4
        return "\"" + title + "\" by " + author + " costs P" + String.format("%.2f", price) + ".";   // %.2f = 2 decimals
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}