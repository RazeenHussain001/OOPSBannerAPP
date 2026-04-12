import java.util.Scanner;

public class AdditionProgram {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.print("Enter first number: ");
        x = input.nextInt();

        System.out.print("Enter second number: ");
        y = input.nextInt();

        int result1 = add(x, y);
        int result2 = add(10, 20);

        System.out.println("Sum1 = " + result1);
        System.out.println("Sum2 = " + result2);
    }
}