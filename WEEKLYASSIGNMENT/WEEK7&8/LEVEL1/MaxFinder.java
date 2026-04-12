import java.util.Scanner;

public class MaxFinder {

    public static int findMax(int a, int b, int c) {

        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x, y, z;

        System.out.print("Enter 3 numbers: ");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();

        int result = findMax(x, y, z);

        System.out.println("Max = " + result);
    }
}