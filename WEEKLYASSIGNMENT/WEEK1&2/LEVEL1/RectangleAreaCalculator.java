import java.util.Scanner;

/**
 * Program Name: RectangleAreaCalculator
 * Purpose: Calculate area of a rectangle using user input
 */

public class RectangleAreaCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables
        double length;
        double width;
        double area;

        // User Input
        System.out.print("Enter length: ");
        length = input.nextDouble();

        System.out.print("Enter width: ");
        width = input.nextDouble();

        // Calculation
        area = length * width;

        // Output
        System.out.println("Area of rectangle = " + area);
    }
}