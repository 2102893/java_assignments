package task_one;

import java.util.Scanner; //importing Scanner

public class Question5 {
    public static void main(String[] args) {

        // my variables
        Double num1, num2, result;
        char myOperator;

        Scanner input = new Scanner(System.in); // Scanner object

        // input first number
        System.out.println("Enter the first number");
        num1 = input.nextDouble();

        // input operator

        System.out.println("Type one of these signs (+, -, *, or /) as your operator: ");
        myOperator = input.next().charAt(0);

        // input last number
        System.out.println("Enter last number");
        num2 = input.nextDouble();

        if (myOperator == '-') {
            result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
        }
        if (myOperator == '+') {
            result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
        }
        if (myOperator == '*') {
            result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
        }
        if (myOperator == '/') {
            result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
        }
    }
}