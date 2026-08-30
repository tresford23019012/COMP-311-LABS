// TRESFORD CHIPILI 23019012
// QUESTION 3

import java.util.Scanner; // this line is for importing the scanner class

public class Question3 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // reads text typed in and stores it

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); //alsp reads text typed but it reads int 

        int futureAge = age + 5; // add currents age with 5

        System.out.println("Hello " + name + " In five years you will be " + futureAge + " years old");

    }
}