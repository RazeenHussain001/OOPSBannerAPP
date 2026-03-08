import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        boolean isPrime = true;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
        }
    }
}