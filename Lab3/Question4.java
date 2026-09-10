// TRESFORD CHIPILI 23019012
// QUESTION 4: REPEATING MENU

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        // do-while runs the body FIRST, then checks the condition -
        // perfect for a menu, since we want to show it at least once before checking input
        do {
            System.out.println("\n1. Continue");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Continuing...");
            } else if (choice != 2) {
                System.out.println("Please enter either 1 or 2.");
            }

        } while (choice != 2); // keep looping until the user picks Exit

        System.out.println("Goodbye!");

        input.close();
    }
}