//TRESFORD CHIPILI 23019012
//QUESTION 2 : WRITING AN ARRAY TO A FILE

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question2 {
    public static void main(String[] args) {

        double[] pricesInPula = {45.50, 119.95, 15.75, 8.95, 249.30}; // A double array of prices in pula for my COMP-311 supplies 

        try { // Writing to a file can throw IOException, so we wrap it in try/catch
            PrintWriter writer = new PrintWriter(new FileWriter("prices_output.txt"));

            // for loop writes every value to the file, one per line
            for (int i = 0; i < pricesInPula.length; i++) {
                writer.println(pricesInPula[i]);
            }

            writer.close(); // flush and close so the data actually gets saved

            System.out.println("Wrote " + pricesInPula.length + " prices to prices_output.txt, one per line.");

        } catch (IOException e) {
            System.out.println("Something went wrong while writing the file: " + e.getMessage());
        }
    }
}