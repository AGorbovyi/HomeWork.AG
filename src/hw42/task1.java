package hw42;

import java.util.List;
import java.util.stream.Collectors;

public class task1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 7, 5, 8, 2, 9, 1);
        List<Integer> result = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(result);
    }
}
