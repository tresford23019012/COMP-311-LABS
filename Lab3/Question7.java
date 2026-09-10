// TRESFORD CHIPILI 23019012
// QUESTION 7: MULTIPLICATION TABLE

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number and I'll print its multiplication table: ");
        int number = input.nextInt();

        System.out.println("Multiplication table for " + number + ":");

        // for loop is ideal here because we know exactly how many times to repeat (1 to 12)
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        input.close();
    }
}