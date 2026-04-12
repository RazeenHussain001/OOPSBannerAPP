import java.util.Scanner;

public class MatrixSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rows, cols, sum = 0;

        System.out.print("Enter rows: ");
        rows = input.nextInt();

        System.out.print("Enter columns: ");
        cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }
}