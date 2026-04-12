import java.util.Scanner;

public class ArrayReverse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size;

        System.out.print("Enter size: ");
        size = input.nextInt();

        if (size <= 0) {
            System.err.println("Invalid size!");
            System.exit(0);
        }

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value: ");
            arr[i] = input.nextInt();
        }

        System.out.println("Reversed Array:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}