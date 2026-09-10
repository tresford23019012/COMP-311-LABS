// TRESFORD CHIPILI 23019012
// QUESTION 9: FACTORIAL

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a whole number and I'll calculate its factorial: ");
        int number = input.nextInt();

        // Factorial of 0 is defined as 1, so starting the running product at 1 handles that too
        long factorial = 1; // long, not int - factorials grow fast and can overflow an int quickly

        for (int i = 1; i <= number; i++) {
            factorial *= i; // same as factorial = factorial * i
        }

        System.out.println(number + "! = " + factorial);

        input.close();
    }
}