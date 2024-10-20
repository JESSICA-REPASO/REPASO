import java.util.Scanner;

public class ArithmeticOperations {
    
    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform arithmetic operations
        double sum = add(num1, num2);
        double difference = subtract(num1, num2);
        double product = multiply(num1, num2);
        double quotient = divide(num1, num2);
        
        // Display results
        System.out.println("Results:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        if (num2 != 0) {
            System.out.println("Division: " + quotient);
        }

        // Close the scanner
        scanner.close();
    }
}
