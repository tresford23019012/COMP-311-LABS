// TRESFORD CHIPILI 23019012
// QUESTION 6: STATIC VS INSTANCE METHODS

class Calculator {
    private int callCount = 0; // belongs to each Calculator object, not the class itself

    static int add(int a, int b) { // no object needed, works purely on its inputs
        return a + b;
    }

    int multiply(int a, int b) { // needs an object because it updates callCount
        callCount++;
        return a * b;
    }

    int getCallCount() { // reports how many times multiply() has run on this object
        return callCount;
    }
}

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Calculator.add(8, 5) = " + Calculator.add(8, 5)); // called on the class directly

        Calculator calc = new Calculator(); // instance needed for multiply()
        System.out.println("calc.multiply(3, 4) = " + calc.multiply(3, 4));
        System.out.println("calc.multiply(6, 7) = " + calc.multiply(6, 7));
        System.out.println("Times multiply() was called: " + calc.getCallCount());
    }
}