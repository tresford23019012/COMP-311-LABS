// TRESFORD CHIPILI 23019012
// QUESTION 1: COUNTDOWN

public class Question1 {
    public static void main(String[] args) {

        // Start at 10 and count down - while loop checks the condition before each pass
        int count = 10;

        while (count >= 1) {
            System.out.println(count);
            count--; // decrement, otherwise this loop never ends
        }

        System.out.println("Liftoff!");
    }
}
