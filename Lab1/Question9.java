//TRESFORD CHIPILI 23019012
// QUESTION 9

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine(); // nextLine() reads the whole line, including spaces

        int length = sentence.length(); // counts every character including spaces
        String upper = sentence.toUpperCase();
        String lower = sentence.toLowerCase();
        boolean hasJava = sentence.contains("Java"); // checks if the word java is present in the sentence

        System.out.println("Counting every character, the sentence has a length of " + length);
        System.out.println("In upper case, the sentence reads: " + upper);
        System.out.println("In lower case, the sentence reads: " + lower);
        System.out.println("Checking whether the sentence contains the word \"Java\": " + hasJava);
    }
}
