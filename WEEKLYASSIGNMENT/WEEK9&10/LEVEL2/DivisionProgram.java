import java.util.Scanner;

public class DivisionProgram {

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter numerator: ");
            int a = input.nextInt();

            System.out.print("Enter denominator: ");
            int b = input.nextInt();

            int result = divide(a, b);

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero!");
        }
    }
}