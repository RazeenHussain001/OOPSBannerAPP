import java.util.Scanner;

public class StringArrayDemo {

    public static String[] getNames(Scanner input, int size) {

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name: ");
            names[i] = input.nextLine();
        }

        return names;
    }

    public static void displayNames(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size;

        System.out.print("Enter number of names: ");
        size = input.nextInt();
        input.nextLine();

        String[] names = getNames(input, size);

        displayNames(names);
    }
}