// TRESFORD CHIPILI 23019012
// QUESTION 4: METHOD OVERLOADING

public class Question4 {

    static int combine(int a, int b) { // adds two whole numbers
        return a + b;
    }

    static String combine(String a, String b) { // joins two pieces of text
        return a + b;
    }

    static double combine(double a, double b) { // adds two decimal numbers
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("combine(15, 27) = " + combine(15, 27));
        System.out.println("combine(\"Ga\", \"borone\") = " + combine("Ga", "borone"));
        System.out.println("combine(45.50, 12.25) = " + combine(45.50, 12.25)); // e.g. two pula amounts
    }
}