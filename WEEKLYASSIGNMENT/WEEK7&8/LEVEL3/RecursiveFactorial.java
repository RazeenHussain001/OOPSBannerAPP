import java.util.Scanner;

public class RecursiveFactorial {

    public static int factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
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