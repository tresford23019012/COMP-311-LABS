//TRESFORD CHIPILI 23019012
// QUESTION 6 


import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first score: ");
        double score1 = sc.nextDouble(); // reading as double so the average keeps its decimal places

        System.out.print("Enter the second score: ");
        double score2 = sc.nextDouble();

        System.out.print("Enter the third score: ");
        double score3 = sc.nextDouble();

        double average = (score1 + score2 + score3) / 3; // parentheses make sure the sum happens before dividing

        System.out.println("After adding up all three scores and dividing by 3, the average comes out to " + average);
    }
}
