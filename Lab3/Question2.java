// TRESFORD CHIPILI 23019012
// QUESTION 2: SUM OF NUMBERS

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive whole number and I will sum everythingg from 1 up to the number you entered: ");
        int number = input.nextInt();

        int sum = 0;
        int i = 1; // counter that walks from 1 up to the  number entered

        while(i <= number) { // while loop adds i to the running sum then moves i foward
            sum += i;
            i++;
        }
        System.out.println("The sum of all whole numbers from 1 to " + number + " is: " + sum);

        input.close();
    }
}