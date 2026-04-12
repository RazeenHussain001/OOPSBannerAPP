public class ArraySumCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size;
        int sum = 0;

        System.out.print("Enter number of elements: ");
        size = input.nextInt();

        if (size <= 0) {
            System.err.println("Invalid size!");
            System.exit(0);
        }

        int[] numbers = new int[size];

        // Input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Calculation
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum = " + sum);
    }
}