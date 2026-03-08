import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double basicSalary;
        double hra;
        double da;
        double totalSalary;

        System.out.print("Enter basic salary: ");
        basicSalary = input.nextDouble();

        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;

        totalSalary = basicSalary + hra + da;

        System.out.println("Total Salary = " + totalSalary);
    }
}