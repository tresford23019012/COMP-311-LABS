// TRESFORD CHIPILI 23019012
// QUESTION 3: EVEN NUMBERS

public class Question3 {
    public static void main(String[] args) {

        // Start at 2 - the first even number - and step by 2 each time
        int number = 2;

        System.out.println("Even numbers between 1 and 50:");

        while (number <= 50) {
            System.out.println(number);
            number += 2; // skip straight to the next even number
        }
    }
}