package by.overone.lesson31.repository.impl;

import by.overone.lesson31.entity.Book;
import by.overone.lesson31.repository.IBookRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository {
    private static final String DRIVERMYSQL = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String USER = "root";
    private static final String PASSWORD = "44331534";


    @Override
    public List<Book> readAll() {
        List<Book> books = new ArrayList<>();
        try {
            Class.forName(DRIVERMYSQL);
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM world.my_books");
            while (resultSet.next()) {
                Long bookId = Long.valueOf(resultSet.getString(1));
                String title = resultSet.getString(2);
                String author = resultSet.getString(3);
                Long quantity = Long.valueOf(resultSet.getString(4));
                books.add(new Book(bookId, title, author, quantity));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
//            connection.close();
        }
        return books;
    }

    @Override
    public List<Book> readByAuthor(String authorName) {
        List<Book> books = new ArrayList<>();
        try {
            Class.forName(DRIVERMYSQL);
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM world.my_books WHERE author = ?");
            preparedStatement.setString(1, authorName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Long bookId = Long.valueOf(resultSet.getString(1));
                String title = resultSet.getString(2);
                String author = resultSet.getString(3);
                Long quantity = Long.valueOf(resultSet.getString(4));
                books.add(new Book(bookId, title, author, quantity));
            }
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public void updateQuantity (int id, int quantity) {
        try{
        Class.forName(DRIVERMYSQL);
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        PreparedStatement preparedStatement =
                connection.prepareStatement("UPDATE world.my_books SET my_books.quantity=? WHERE my_books.ID=?;");
        preparedStatement.setInt(1, quantity);
        preparedStatement.setInt(2, id);
        int resultSet = preparedStatement.executeUpdate();
        connection.close();
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
        }
    }

    @Override
    public void updateTitle (int idBook, String title) {
        try {
            Class.forName(DRIVERMYSQL);
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement =
                    connection.prepareStatement("UPDATE world.my_books SET my_books.title=? WHERE my_books.ID=?;");
            preparedStatement.setString(1, title);
            preparedStatement.setInt(2, idBook);
            int resultSet = preparedStatement.executeUpdate();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateAuthor(int idBook, String author) {
        try {
            Class.forName(DRIVERMYSQL);
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement =
                    connection.prepareStatement("UPDATE world.my_books SET my_books.author=? WHERE my_books.ID=?;");
            preparedStatement.setString(1, author);
            preparedStatement.setInt(2, idBook);
            int resultSet = preparedStatement.executeUpdate();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBook(int idBook) {
        try {
            Class.forName(DRIVERMYSQL);
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement =
                    connection.prepareStatement("DELETE FROM world.my_books WHERE my_books.ID=?;");
            preparedStatement.setInt(1, idBook);
            int resultSet = preparedStatement.executeUpdate();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
