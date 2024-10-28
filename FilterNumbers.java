import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static void main(String[] args) {
        // Creating another list of integers
        List<Integer> numbers = Arrays.asList(12, -5, 23, 8, -10, 45, 3, -1, 0, 18, 22);

        // Predicates for different conditions
        Predicate<Integer> isPositive = number -> number >= 0;
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isGreaterThan10 = number -> number > 10;

        // Filtering the list based on each condition
        List<Integer> positiveNumbers = numbers.stream()
                .filter(isPositive)
                .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());

        List<Integer> greaterThan10 = numbers.stream()
                .filter(isGreaterThan10)
                .collect(Collectors.toList());

        // Printing the results
        System.out.println("Original List: " + numbers);
        System.out.println("Positive Numbers: " + positiveNumbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Numbers Greater Than 10: " + greaterThan10);
    }
}
