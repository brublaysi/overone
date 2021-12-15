package by.overone.lesson31.controller;

import by.overone.lesson31.entity.Book;
import by.overone.lesson31.exception.BookNotFoundException;
import by.overone.lesson31.service.IBookService;
import by.overone.lesson31.service.impl.BookService;

import java.util.List;
import java.util.Scanner;

public class BookController {

    private static final IBookService bookService = new BookService();

    public void mainMenu() {
        boolean flag = true;

        while (flag) {
            System.out.println("Select one of the following option:\n");
            System.out.println("1. Get all books. Watch, update or delete");
            System.out.println("2. Get book by author");
            System.out.println("3. Add book");
            System.out.println("4. Exit");
            int result = new Scanner(System.in).nextInt();
            switch (result) {
                case 1:
                    readAll();
                    break;
                case 2:
                    readByAuthor();
                    break;
                case 3:
                    addBook();
                    break;
                case 4: System.out.println("Bye-bye my dear friend");
                    flag = false;
                    break;
                default:
                    System.err.println("Something went wrong ..");
            }
        }
    }

    public void readAll() {
        System.out.println("Its all book. What you wanna do?");
        List<Book> books = bookService.readAll();
        viewBooks(books);
        System.out.println();
        System.out.println("1. Update book");
        System.out.println("2. Delete book");
        System.out.println("3. Back to the main menu");
        System.out.println("4. Exit");
        int bookId = new Scanner(System.in).nextInt();
        boolean flag = true;
        while (flag) {
            switch (bookId) {
                case 1:
                    updateBook();
                    break;
                case 2:
                    deleteBook();
                    break;
                case 3:
                    mainMenu();
                    break;
                case 4:
                    flag = false;
                    System.out.println("Goodbye. Сome to us again");
                    break;
                default:
                    flag = false;
                    System.err.println("Something went wrong ..");
            }
        }
    }

    public void updateBook() {
        System.out.println("Write ID of the book, which you want to update");
        int idBook = new Scanner(System.in).nextInt();
        System.out.println("What you want to update?");
        System.out.println("1. Title");
        System.out.println("2. Author");
        System.out.println("3. Quantity");
        int updateBook = new Scanner(System.in).nextInt();
        switch (updateBook) {
            case 1:
                System.out.println("Write the new title of this book");
                String title = new Scanner(System.in).nextLine();
                try {
                    bookService.updateTitle(idBook, title);
                } catch (BookNotFoundException e) {
                System.out.println(e.getMessage());
                }
                System.out.println("Title successful update ");
                break;
            case 2:
                System.out.println("Write the new Author of this book");
                String author = new Scanner(System.in).nextLine();
                try {
                    bookService.updateAuthor(idBook, author);
                } catch (BookNotFoundException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                try {
                    bookService.updateQuantity(idBook, updateBook);
                } catch (BookNotFoundException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Something wrong");
        }
    }

    public void deleteBook() {
            System.out.println("Write ID of the book you wanna delete");
            int id=new Scanner(System.in).nextInt();
            try {
                bookService.deleteBook(id);
            } catch (BookNotFoundException e) {
                System.err.println(e.getMessage());
            }

    }

    public void addBook() {
        // TODO
    }

    public void readByAuthor() {
        System.out.println("Write author: ");
        String authorName = new Scanner(System.in).nextLine();
        List<Book> books = null;
        try {
            books = bookService.readByAuthor(authorName);
        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        }
        viewBooks(books);
    }

    private void viewBooks(List<Book> books) {
        if (books != null) {
            int counter = 1;
            for (Book book : books) {
                System.out.println(counter + ". " + book);
                counter++;
            }
        }
    }
}
