import java.util.Scanner;

/**
 * Program Name: SimpleInterestCalculator
 * Purpose: Calculate simple interest
 */

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principal;
        double rate;
        double time;
        double simpleInterest;

        System.out.print("Enter principal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter rate of interest: ");
        rate = input.nextDouble();

        System.out.print("Enter time in years: ");
        time = input.nextDouble();

        simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);
    }
}