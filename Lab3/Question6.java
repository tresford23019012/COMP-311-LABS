// TRESFORD CHIPILI 23019012
// QUESTION 6: RUNNING TOTAL

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int total = 0;

        // do-while so we always ask for at least one number before checking for 0
        do {
            System.out.print("Enter a number to add (0 to stop): ");
            number = input.nextInt();
            total += number; // adding 0 on the last entry doesn't change the total anyway
        } while (number != 0);

        System.out.println("Final total: " + total);

        input.close();
    }
}