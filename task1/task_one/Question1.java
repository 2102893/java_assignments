package task_one;

//Scanner import
import java.util.Scanner;

public class Question1 {

    // main method
    public static void main(String[] args) {

        // my Scanner object
        Scanner input = new Scanner(System.in);

        // My variables
        String surname;
        String numberType;
        int age;
        int numOfCharacters;

        System.out.println("Enter your surname :");
        surname = input.nextLine(); // input name

        System.out.println("Enter your age :");
        age = input.nextInt(); // input age

        // Finding number of characters in surname
        numOfCharacters = surname.length();
        //Check if even or odd
        if (age % 2 == 0) {
            // age is even
            numberType = "even";
        } else {
            // age is odd
            numberType = "odd";
        }
        //output
        System.out.println("Your surname has : " + numOfCharacters + " characters");
        System.out.println("Your age is an " + numberType + " number.");
    }
}