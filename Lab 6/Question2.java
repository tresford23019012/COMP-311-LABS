// TRESFORD CHIPILI 23019012
// QUESTION 2: A METHOD WITH A RETURN VALUE

public class Question2 {

    static double circleArea(double radius) { // area = pi * r^2
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double smallDishRadius = 4.5;   // radius in cm of a small serving dish
        double kgotlaCircleRadius = 12.0; // radius in metres of a village kgotla meeting circle

        System.out.println("Area of small dish (r=" + smallDishRadius + " cm): " + circleArea(smallDishRadius) + " cm^2");
        System.out.println("Area of kgotla circle (r=" + kgotlaCircleRadius + " m): " + circleArea(kgotlaCircleRadius) + " m^2");
    }
}