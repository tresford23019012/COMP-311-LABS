// TRESFORD CHIPILI 23019012
// QUESTION 8: COUNTING VOWELS

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String text = input.nextLine();

        // Lowercase everything first so we only need to check 5 letters, not 10
        String lowerText = text.toLowerCase();
        int vowelCount = 0;

        // for loop walks through every character by index
        for (int i = 0; i < lowerText.length(); i++) {
            char letter = lowerText.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCount++; // checks and counts vowels
            }
        }

        System.out.println("\"" + text + "\" contains " + vowelCount + " vowels.");

        input.close();
    }
}