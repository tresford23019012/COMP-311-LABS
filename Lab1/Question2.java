//TRESFORD CHIPILI 23019012 
//QUESTION 2 


public class Question2 {
    public static void main(String[] args) {
        
        byte smallNumber = 22;
        short rentAmount = 13000;
        int totalStudents = 69;
        long worldPopulation = 8000000000L;  // L suffix needed when value exceeds int's range
        float pi = 3.142857143f; // f suffix needed else java assumes double otherwise
        double tutionFees = 24750.75;
        char gender = 'M'; // single quotes char holds exactly one character
        boolean result = true;


        System.out.println("byte: byte is small it ranges from negative 128 to positive 127,an example is my age " + smallNumber +  " years old");
        System.out.println("short: short is for medium range whole numbers such a rental of "  + rentAmount + " pula");
        System.out.println("int: There are " + totalStudents +  "students in Group f level 300");
        System.out.println("long: The world population has crossed over " + worldPopulation);
        System.out.println("float: float is used aganist double to store more decimals such as pi which is " + pi);
        System.out.println("double: My tution fees cost "  + tutionFees + " pula");
        System.out.println("char: The abbreviation for male is:" + gender);
        System.out.println("boolean: The earth is round:" + result);

    }
}
