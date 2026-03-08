import java.util.Scanner;

public class DistanceCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double speed;
        double time;
        double distance;

        System.out.print("Enter speed: ");
        speed = input.nextDouble();

        System.out.print("Enter time: ");
        time = input.nextDouble();

        distance = speed * time;

        System.out.println("Total Distance = " + distance);
    }
}