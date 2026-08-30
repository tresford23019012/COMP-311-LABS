//TRESFORD CHIPILI 23019012
// QUESTION 4

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number: "); //prints without moving to a new line
        int wholeNumber = sc.nextInt(); // reads and stores int text

        System.out.print("Enter a decimal number: ");
        double decimalNumber = sc.nextDouble(); // same function as nextInt 

        System.out.print("Enter a single word: ");
        String word = sc.next(); // reads a single word

        System.out.println("You entered " + wholeNumber + ", " + decimalNumber + ", and the word " + word );

    }
    
}
