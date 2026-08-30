//TRESFORD CHIPILI 23019012
//QUESTION 7

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble(); // reading as double to avoid losing decimal precision

        double fahrenheit = celsius * 9.0 / 5 + 32; // 9.0 forces decimal division instead of integer division

        System.out.println("A temperature of " + celsius + " degrees Celsius converts to " + fahrenheit + " degrees Fahrenheit.");
    }
}
