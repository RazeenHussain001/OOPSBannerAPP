import java.util.Scanner;

public class ASCIIValue {

    public static int getASCII(char ch) {
        return (int) ch;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = input.next().charAt(0);

        System.out.println("ASCII = " + getASCII(ch));
    }
}