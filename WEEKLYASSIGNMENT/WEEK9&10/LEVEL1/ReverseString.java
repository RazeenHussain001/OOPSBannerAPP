import java.util.Scanner;

public class ReverseString {

    public static String reverse(String text) {

        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = input.nextLine();

        System.out.println("Reversed = " + reverse(text));
    }
}