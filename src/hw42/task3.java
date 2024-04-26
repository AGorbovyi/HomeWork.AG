package hw42;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class task3 {

    public static void main(String[] args) {
        LibraryBookRepository libraryBookRepository = new LibraryBookRepository();
        libraryBookRepository.init();
        Collection<LibraryBook> books = libraryBookRepository.values();
        Set<String> authors = books.stream().map(b -> b.getAuthor()).collect(Collectors.toSet());
        for (String author : authors) {
            System.out.println(author);
            System.out.println(books.stream().filter(b -> b.getAuthor().equals(author)).map(b -> b.getBookTitle()).collect(Collectors.toList()));
        }
        System.out.println("================================");
        System.out.println(books.stream().map(b -> b.getPublisher()).collect(Collectors.toSet()));
    }
}
