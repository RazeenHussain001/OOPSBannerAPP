import java.util.Scanner;

public class StringLengthCalculator {

    public static String getInput(Scanner input) {
        System.out.print("Enter a string: ");
        return input.nextLine();
    }

    public static int calculateLength(String text) {
        return text.length();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = getInput(input);
        int length = calculateLength(text);

        System.out.println("Length = " + length);
    }
}