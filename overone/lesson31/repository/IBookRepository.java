package by.overone.lesson31.repository;

import by.overone.lesson31.entity.Book;

import java.util.List;

public interface IBookRepository {
    List<Book> readAll();

    List<Book> readByAuthor(String authorName);
    void updateQuantity(int idBook, int quantity);
    void updateTitle (int idBook, String title);
    void updateAuthor (int idBook, String author);
    void deleteBook(int id);
}
