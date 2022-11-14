package Question3.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class AreaOfTriangle {

    // these variables are available in this class, and shared with all methods here
    static double triangle_Base, triangle_Height, area;

    // input the triangle_Base and the triangle_Height
    void doInputs() {

        // scanner object
        Scanner input = new Scanner(System.in);

        // get inputs
        System.out.println("Enter the base measurement of the triangle : ");
        triangle_Base = input.nextDouble(); // input triangle_Base
        System.out.println("Enter the height measurement of the triangle : ");
        triangle_Height = input.nextDouble(); // input triangle_Height
    }

    // get the area of the rectangle
    void findArea() {

        // area of triangle = 1/2 * base * height
        area = 1 / 2 * triangle_Base * triangle_Height;
    }

    // method to output area
    void getResults() {
        System.out.println("The area is: " + area);
    }

    // main method
    public static void main(String[] args) {

        // calling the non-static methods in the main method
        AreaOfTriangle myClassObj = new AreaOfTriangle();
        myClassObj.doInputs();
        myClassObj.findArea();
        myClassObj.getResults();
    }

}
