import java.util.Scanner;

public class FactorialMethod {

    public static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter number: ");
        num = input.nextInt();

        if (num < 0) {
            System.err.println("Invalid input!");
            System.exit(0);
        }

        System.out.println("Factorial = " + factorial(num));
    }
}