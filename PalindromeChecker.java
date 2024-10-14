import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Use StringBuilder to reverse the input string
        StringBuilder reversedString = new StringBuilder(inputString);
        reversedString.reverse();

        // Check if the original string and the reversed string are equal
        if (inputString.equals(reversedString.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}