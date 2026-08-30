// TRESFORD CHIPILI 23019012
// QUESTION 5


import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double num1 = sc.nextDouble();

    System.out.print("Enter the second number: ");
    double num2 = sc.nextDouble();

    double sum = num1 + num2;
    double difference = num1 - num2;
    double product = num1 * num2;
    double quotient = num1 / num2;
    double remainder = num1 % num2; // % gives the remainder in division

    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);
    System.out.println("Remainder: " + remainder);    
 
    }
}
