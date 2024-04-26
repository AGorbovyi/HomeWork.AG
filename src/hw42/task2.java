package hw42;

import java.util.List;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        List<String> words = List.of("hELLO", "JaVa", "LAMBDA");
        System.out.println(words.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase()).collect(Collectors.toList()));
    }
}
