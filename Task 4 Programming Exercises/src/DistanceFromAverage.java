import java.util.Scanner;

public class DistanceFromAverage {

    public static void main(String[] args) {
        double[] numbers = new double[20];
        double total = 0;
        double average = 0;
        int x = 0;
        double QUIT = 99999;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double (or 99999 to quit) >>> ");
        double input = scanner.nextDouble();
        while (input != QUIT && x < numbers.length) {
            numbers[x] = input;
            total += input;
            ++x;
            if (x < numbers.length) {
                System.out.print("Enter a double (or 99999 to quit) >>> ");
                input = scanner.nextDouble();
            }
        }
        if (numbers.length == 0) {
            System.out.println("You have not keyed in any doubles!");
        }
        else {
            average = total / x;
            System.out.println("You entered " + x + " numbers.\n" + "The average is " + average);
            for (int j = 0; j < x; j++) {
                System.out.println(numbers[j] + " is " + (numbers[j] - average) + " away from the average.");
            }
        }
    }
}
