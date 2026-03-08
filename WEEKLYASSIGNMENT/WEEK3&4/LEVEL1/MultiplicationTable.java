import java.util.Scanner;

/**
 Program: MultiplicationTable
 Purpose: Print multiplication table using for loop
*/

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int result;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 1; i <= 10; i++) {

            result = number * i;

            System.out.println(number + " x " + i + " = " + result);
        }
    }
}