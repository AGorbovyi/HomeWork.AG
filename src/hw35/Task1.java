package hw35;

//Задача 1. Имеется текст (10-20 слов, должны быть повторяющиеся) без знаков препинания и больших букв, в виде одной строки.
// Получить список слов из текста. Удалить повторяющиеся слова.

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        String text = "To be or not to be that is the question " +
                "Whether it is nobler in the mind to suffer " +
                "The slings and arrows of outrageous fortune " +
                "Or to take arms against a sea of troubles " +
                "And by opposing end them To die to sleep " +
                "No more and by a sleep to say we end";

        System.out.println(text);
        System.out.println("=============================");

        String[] words = text.toLowerCase().split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("============= Unique Words in Text ================");

        Set<String> uniqueWords = new HashSet<>(List.of(words));
        System.out.println(uniqueWords);

        System.out.println("============= Sort Words from A-Z ================");

        Set<String> sortUniqueWords = new TreeSet<>(List.of(words));
        System.out.println(sortUniqueWords);



    }

}
