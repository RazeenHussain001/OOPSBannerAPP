import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char grade;

        System.out.print("Enter grade (A/B/C/D/F): ");
        grade = input.next().charAt(0);

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Good");
                break;

            case 'C':
                System.out.println("Average");
                break;

            case 'D':
                System.out.println("Below Average");
                break;

            default:
                System.out.println("Fail");
        }
    }
}