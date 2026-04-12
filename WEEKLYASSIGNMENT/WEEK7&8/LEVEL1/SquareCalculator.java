import java.util.Scanner;

public class SquareCalculator {

    public static int calculateSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter number: ");
        num = input.nextInt();

        int result = calculateSquare(num);

        System.out.println("Square = " + result);
    }
}