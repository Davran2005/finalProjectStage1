package service.imple;

import enums.Genre;
import model.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImple implements BookService {
    List<Book>bookList=new ArrayList<>();
    List<Genre>genres=new ArrayList<>();
    @Override
    public List<Book> createBooks(List<Book> books) {
        this.bookList.addAll(books);
        return bookList;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookList;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        for (Book booksGenere:bookList) {
            if (booksGenere.getName().equals(genre));{
                if (booksGenere.getId().equals(genre));
                this.bookList.addAll(bookList);
            }

        }
        return null;
    }

    @Override
    public Book removeBookById(Long id) {

        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        return null;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        return null;
    }

    @Override
    public Book maxPriceBook() {
        return null;
    }
}
