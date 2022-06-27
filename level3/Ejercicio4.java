package level3;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static int factorial(int number) {
        return (number <= 1) ? 1 : number * factorial(number - 1);
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 4, 4, 4);

        Set<Integer> factoredNumbers = Set.copyOf(numbers)
            .stream()
            .map(n -> factorial(n))
            .collect(Collectors.toSet());

        System.out.println(factoredNumbers);
    }
}
