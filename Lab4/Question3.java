//TRESFORD CHIPILI 23019012
//QUESTION 3: SUM,SMALLEST,LARGEST-WRITTEN TO A FILE

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question3 {
    public static void main(String[] args) {

        // My exam scores for this semester as the integer array
        int[] examScores = {78, 65, 92, 54, 88, 71, 60};

        // Start sum at 0, and assume the first element is both smallest and largest until the rest are checked
        int sum = 0;
        int smallest = examScores[0];
        int largest = examScores[0];

        // Single for loop does all three jobs at once - sum, smallest, largest
        for (int i = 0; i < examScores.length; i++) {
            sum += examScores[i]; // running total

            if (examScores[i] < smallest) {
                smallest = examScores[i];
            }

            if (examScores[i] > largest) {
                largest = examScores[i];
            }
        }

        // Writing results can throw IOException
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("scores_summary.txt"));

            writer.println("Sum of all scores: " + sum);
            writer.println("Smallest score: " + smallest);
            writer.println("Largest score: " + largest);

            writer.close();

            System.out.println("Summary written to scores_summary.txt");
            System.out.println("Sum: " + sum);
            System.out.println("Smallest: " + smallest);
            System.out.println("Largest: " + largest);

        } catch (IOException e) {
            System.out.println("Something went wrong while writing the file: " + e.getMessage());
        }
    }
}
