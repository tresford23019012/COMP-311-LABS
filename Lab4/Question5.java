// TRESFORD CHIPILI 23019012
// QUESTION 5: PALINDROME CHECK

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or phrase and I'll check if it's a palindrome: ");
        String original = input.nextLine();

        // Ignore case as the question says to convert everything to lowercase first
        String cleaned = original.toLowerCase();

        // Build the reverse of the string by walking backwards through it
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i); // charAt grabs one character at a time
        }

        // A palindrome reads the same forwards and backwards, so just compare the two
        if (cleaned.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome!");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }

        input.close();
    }
}