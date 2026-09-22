// TRESFORD CHIPILI 23019012
// QUESTION 10: PUTTING IT TOGETHER

import java.util.Scanner;

class Rectangle {
    static double area(double length, double width) { // length x width
        return length * width;
    }

    static double perimeter(double length, double width) { // 2 x (length + width)
        return 2 * (length + width);
    }
}

public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        System.out.println("The Area of the rectangle is: " + Rectangle.area(length, width) + "cm^2");
        System.out.println("The Perimeter of the rectangle is: " + Rectangle.perimeter(length, width) + "cm");

        input.close();
    }
}