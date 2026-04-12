import java.util.Scanner;

public class MaxElementFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size;

        System.out.print("Enter array size: ");
        size = input.nextInt();

        if (size <= 0) {
            System.err.println("Invalid size!");
            System.exit(0);
        }

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element: ");
            numbers[i] = input.nextInt();
        }

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum = " + max);
    }
}