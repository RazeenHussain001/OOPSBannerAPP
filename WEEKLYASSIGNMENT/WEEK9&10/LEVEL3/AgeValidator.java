import java.util.Scanner;

public class AgeValidator {

    public static void validateAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter age: ");
            int age = input.nextInt();

            validateAge(age);

            System.out.println("Valid age");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}