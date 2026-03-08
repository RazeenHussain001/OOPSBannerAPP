import java.util.Scanner;

/**
 Program: SumCalculator
 Purpose: Calculate sum of numbers from 1 to N
*/

public class SumCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int counter = 1;
        int sum = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (counter <= number) {

            sum = sum + counter;
            counter++;
        }

        System.out.println("Sum = " + sum);
    }
}