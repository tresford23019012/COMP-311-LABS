//TRESFORD CHIPILI 23019012
// QUESTION1: READING WORDS INTO AN ARRAY

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        // Scanner on a File can throw FileNotFoundException, so we wrap it in try/catch
        try {
            File file = new File("names.txt");
            Scanner input = new Scanner(file);

            String[] words = new String[20];
            int index = 0; // this tracks which slot we're filling next forces count to start from 0 till 19

            while (input.hasNext() && index < 20) { // Keep reading while there's another word AND we still have space
                words[index] = input.next(); // next() grabs one word at a time rather than nextln()
                index++; // move to the next empty slot
            }
            input.close(); // free up the file resource

            System.out.println("Words read from names.txt:");
            for (int i = 0; i < index; i++) {
                System.out.println((i + 1) + ". " + words[i]);
            }

            System.out.println("\nTotal words stored: " + index + " out of 20 slots used.");

        } catch (FileNotFoundException e) {   // This runs if names.txt doesn't exist in the project folder
            System.out.println("Could not find names.txt - make sure it's in the same folder as this program."); 
        }
    }
}