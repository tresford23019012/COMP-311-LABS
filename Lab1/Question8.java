//TRESFORD CHIPILI 23019012
//QUESTION 8


import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = sc.nextDouble(); // reading as double so decimal measurements are not lost

        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width); // parentheses make sure length and width add first, before multiplying by 2

        System.out.println("Multiplying the length by the width gives an area of " + area);
        System.out.println("Adding the length and width together, then doubling it, gives a perimeter of " + perimeter);
    }
}
