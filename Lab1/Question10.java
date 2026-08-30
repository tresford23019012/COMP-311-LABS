//TRESFORD CHIPILI 23019012
// QUESTION 10

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");// nextLine() reads the whole line since the name has a space between first and surname
        String fullName = sc.nextLine();

        int spaceIndex = fullName.indexOf(' '); // finds position of the space character

        String firstName = fullName.substring(0, spaceIndex); // takes everthing at the start before the space ut not the end

        String surname = fullName.substring(spaceIndex + 1); // does the opposite of the above one

        char firstInitial = Character.toUpperCase(firstName.charAt(0)); // grabs everything before the space
        char surnameInitial = Character.toUpperCase(surname.charAt(0)); // grabs everything after the space

        System.out.println("Looking only at the part before the space, the first name is: " + firstName);
        System.out.println("Looking only at the part after the space, the surname is: " + surname);
        System.out.println("Taking the first letter of each part in upper case, the initials are: " + firstInitial + "." + surnameInitial + ".");
    }
}