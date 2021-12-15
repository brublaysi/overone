package by.overone.lesson31.service.impl;

import by.overone.lesson31.entity.Book;
import by.overone.lesson31.exception.BookNotFoundException;
import by.overone.lesson31.repository.IBookRepository;
import by.overone.lesson31.repository.impl.BookRepository;
import by.overone.lesson31.service.IBookService;

import java.util.List;

public class BookService implements IBookService {

    private static final IBookRepository bookRepository = new BookRepository();

    @Override
    public List<Book> readAll() {
        return bookRepository.readAll();
    }

    @Override
    public List<Book> readByAuthor(String authorName) {
        List<Book> books = bookRepository.readByAuthor(authorName);
        if (books.size() == 0) {
            throw new BookNotFoundException("Invalid author");
        }
        return books;
    }

    @Override
    public void updateQuantity(int idBook, int quantity) {
        bookRepository.updateQuantity(idBook, quantity);

    }

    @Override
    public void updateTitle(int idBook, String title) {
        bookRepository.updateTitle(idBook, title);
    }

    @Override
    public void updateAuthor(int idBook, String author) {
        bookRepository.updateAuthor(idBook, author);
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteBook(id);
    }
}
