package Question3.leapyear;

import java.util.Scanner;

public class GetLeapYear {

    // this method will determine leap year
    static void determineLeapYear() {

        // variable to store year
        int year;
        // scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year :");
        year = input.nextInt(); // input year

        // is year leap or not
        if ((year % 4) == 0) {
            
            System.out.println(year + " is a leap year");
        } else {
            
            System.out.println(year + " is not a leap year");
        }
    }

    // the main method
    public static void main(String[] args) {
        determineLeapYear(); // calling the method beloww
    }

    

}
