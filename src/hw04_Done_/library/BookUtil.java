package hw04_Done_.library;

public class BookUtil {
    public void editBookCatalogNumber(double catalogNumber, Book book){
        book.catalogNumber = catalogNumber;
    }

    public void editBookPageNumber(int pagesNumber, Book book){
        book.pagesNumber = pagesNumber;
    }

    public void editBookInStorage(boolean inStorage, Book book){
        book.isInStorage = inStorage;
    }

    public Book copyBook(Book book){
        Book copyBook = new Book(book.author, book.bookTitle + " (copy)", book.pagesNumber, book.catalogNumber, book.isInStorage);
        return copyBook;
    }
}
