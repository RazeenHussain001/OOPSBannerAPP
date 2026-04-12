import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number;

        System.out.print("Enter number: ");
        number = input.nextDouble();

        System.out.println("Square Root = " + Math.sqrt(number));
        System.out.println("Power (square) = " + Math.pow(number, 2));
        System.out.println("Absolute = " + Math.abs(number));
    }
}