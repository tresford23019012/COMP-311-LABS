// TRESFORD CHIPILI 23019012
// QUESTION 5: VALIDATING INPUT

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        // do-while forces the prompt to run at least once, then keeps repeating
        // as long as the entered number is out of range
        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = input.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("That's out of range please try again.");
            }

        } while (number < 1 || number > 10);

        System.out.println("Thanks! You entered a valid number: " + number);

        input.close();
    }
}