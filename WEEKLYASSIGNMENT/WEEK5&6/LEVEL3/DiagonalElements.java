import java.util.Scanner;

public class DiagonalElements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size;

        System.out.print("Enter size of square matrix: ");
        size = input.nextInt();

        if (size <= 0) {
            System.err.println("Invalid size!");
            System.exit(0);
        }

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Diagonal Elements:");

        for (int i = 0; i < size; i++) {
            System.out.println(matrix[i][i]);
        }
    }
}