//TRESFORD CHIPILI 23019012
//QUESTION 4 : DECIMAL TO BINARY

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a whole number to convert it to binary: ");
        int number = input.nextInt();

        int original = number; // keep a copy since we're about to destroy 'number' below
        String binary = ""; // build the binary digits here, one at a time

        // Special case - zero in binary is just "0", the loop below wouldn't catch this
        if (number == 0) {
            binary = "0";
        }

        // Repeatedly divide by 2 - the remainder (0 or 1) is the next binary digit,
        // but we get the digits in reverse order (least significant bit first)
        while (number > 0) {
            int remainder = number % 2;      // 0 or 1 - this is one binary digit
            binary = remainder + binary;     // stick it on the Front to reverse the order
            number = number / 2;             // integer division reduces the number each time
        }

        System.out.println(original + " in binary is: " + binary);

        input.close();
    }
}