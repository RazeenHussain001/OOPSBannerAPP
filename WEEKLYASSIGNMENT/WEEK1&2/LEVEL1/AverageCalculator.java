import java.util.Scanner;

/**
 * Program Name: AverageCalculator
 * Purpose: Calculate average of three numbers
 */

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1;
        double number2;
        double number3;
        double average;

        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        System.out.print("Enter third number: ");
        number3 = input.nextDouble();

        average = (number1 + number2 + number3) / 3;

        System.out.println("Average = " + average);
    }
}