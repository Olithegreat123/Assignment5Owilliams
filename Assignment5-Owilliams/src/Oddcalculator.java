
import java.util.Scanner;

public class Oddcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the average (odd) value calculator!");

        int numOfValues = 3;  // User is asked to input three separate numbers

        if (numOfValues > 0) {
            int sum = 0;

            System.out.println("Let's begin to enter positive, ODD integers...");

            for (int i = 0; i < numOfValues; i++) {
                int input = -1;

                while (input <= 0 || input % 2 == 0) {
                    System.out.print("Type a positive (non-zero), ODD integer and press ENTER to add it to the sum: ");

                    while (!scanner.hasNextInt()) {
                        System.out.println("You did not enter a valid integer! Try again.");
                        scanner.next(); // consume invalid input
                    }

                    input = scanner.nextInt();

                    if (input <= 0 || input % 2 == 0) {
                        System.out.println("That's not an odd integer! Try again.");
                    }
                }

                sum += input;
                System.out.println("** current sum: " + sum);
            }

            double average = (double) sum / numOfValues;
            System.out.printf("The average of all the odd numbers you entered is %.15f%n", average);
        } else {
            System.out.println("No average was calculated. There are zero (0) values to average.");
        }

        scanner.close();
    }
}
