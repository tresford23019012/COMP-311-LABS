// TRESFORD CHIPILI 23019012
// QUESTION 5: MORE OVERLOADING PRACTICE

public class Question5 {

    static void displayInfo(String name) { // called when only a name is known
        System.out.println("Name: " + name);
    }

    static void displayInfo(String name, int age) { // called when age is also known
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        displayInfo("Kitso Relaeng");
        displayInfo("Praise Hombarume", 21);
    }
}