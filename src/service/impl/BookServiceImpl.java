package service.impl;

import model.Book;
import service.BookService;

import java.util.*;

public class BookServiceImpl implements BookService {
    List<Book> books = new ArrayList<>();

    public BookServiceImpl(List<Book> books) {
        this.books = books;
    }
    public BookServiceImpl(){

    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public List<Book> createBooks(List<Book> books) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        return books.stream().filter(x->x.getGenre().equals(genre)).toList();
    }

    @Override
    public Book removeBookById(Long id) {
        long bookId = new Scanner(System.in).nextLong();
        books.stream().filter(x-> x.getId()==bookId).findFirst().isPresent(x->getBooks().remove(x));
        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
       books.stream().sorted(Comparator.comparing(Book::getPrice)).forEach(System.out::println);
        return null;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        System.out.println(books.stream().filter(z -> z.getName().startsWith("K")).toList());
        return books.stream().filter(x->x.getName().startsWith("A")).toList();
    }

    @Override
    public Book maxPriceBook() {
        return books.stream().max(Comparator.comparing(Book::getPrice)).get();
    }
}
