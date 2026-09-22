// TRESFORD CHIPILI 23019012
// QUESTION 3: VOID VS RETURNING METHODS

public class Question3 {

    static void printBanner() { // prints directly, gives nothing back to the caller
        System.out.println("=== Welcome to Stayfari Labs ===");
    }

    static String getBanner() { // builds the same text but hands it back as a String
        return "=== Welcome to Stayfari Labs ===";
    }

    public static void main(String[] args) {
        printBanner(); // banner appears on screen immediately

        String savedBanner = getBanner(); // banner is stored for later use instead
        System.out.println("Banner stored in a variable, printed now: " + savedBanner);
    }
}