import java.util.Scanner;

/**
 Program: EvenOddChecker
 Purpose: Check whether a number is even or odd
*/

public class EvenOddChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variable declaration
        int number;
        boolean isEven;

        // User input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Boolean expression
        isEven = (number % 2 == 0);

        // Conditional statement
        if (isEven) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}