import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble(); // Example input: 4.5

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble(); // Example input: 9.4

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble(); // Example input: 3.6

        // Check if all numbers are equal
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else {
            // Find the largest number
            double largest = num1;

            if (num2 > largest) {
                largest = num2;
            }

            if (num3 > largest) {
                largest = num3;
            }

            System.out.println("The largest number is: " + largest);
        }

        // Another example with equal numbers
        System.out.println("\nRunning another example with all numbers equal...");

        num1 = 4;
        num2 = 4;
        num3 = 4;

        // Check if all numbers are equal
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else {
            double largest = num1;

            if (num2 > largest) {
                largest = num2;
            }

            if (num3 > largest) {
                largest = num3;
            }

            System.out.println("The largest number is: " + largest);
        }

        scanner.close();
    }
}
