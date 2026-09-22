// TRESFORD CHIPILI 23019012
// QUESTION 7: PASS BY VALUE

public class Question7 {

    static void tryToDouble(int number) { // only changes its own local copy of the value
        number = number * 2;
        System.out.println("Inside the method, number is now: " + number);
    }

    public static void main(String[] args) {
        int cowsInHerd = 9; // original variable in main

        System.out.println("Before calling tryToDouble, cowsInHerd = " + cowsInHerd);
        tryToDouble(cowsInHerd); // a copy of cowsInHerd is passed, not the variable itself
        System.out.println("After calling tryToDouble, cowsInHerd = " + cowsInHerd); // unchanged
    }
}