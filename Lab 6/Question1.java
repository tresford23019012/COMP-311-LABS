// TRESFORD CHIPILI 23019012
// QUESTION 1: CREATING A METHOD

public class Question1 {

    static boolean isEven(int n) { // returns true when n has no remainder when divided by 2
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int pulaNoteCount = 14;   // an odd number of pula notes
        int cattlePenCount = 20;  // an even number of pens on a farm near Serowe

        System.out.println("Is " + pulaNoteCount + " even? " + isEven(pulaNoteCount));
        System.out.println("Is " + cattlePenCount + " even? " + isEven(cattlePenCount));
        System.out.println("Is 7 even? " + isEven(7));
    }
}