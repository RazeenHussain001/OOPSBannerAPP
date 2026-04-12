import java.util.Scanner;

public class EvenOddChecker {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void displayResult(int number) {

        if (isEven(number)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter number: ");
        num = input.nextInt();

        displayResult(num);
    }
}