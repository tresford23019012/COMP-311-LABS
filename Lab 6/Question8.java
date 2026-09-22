// TRESFORD CHIPILI 23019012
// QUESTION 8: METHOD OVERRIDING

class Animal {
    void speak() { // generic version, used by any Animal without a more specific one
        System.out.println("This animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    void speak() { // replaces Animal's version specifically for Cat objects
        System.out.println("The cat says: Meow!");
    }
}

public class Question8 {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal myCat = new Cat(); // declared as Animal, but runs Cat's overridden method

        genericAnimal.speak();
        myCat.speak();
    }
}