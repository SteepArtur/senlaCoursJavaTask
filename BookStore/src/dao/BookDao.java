package dao;

import model.Book;
import model.BookStatus;
import model.Order;
import model.OrderStatus;

import java.util.List;

public interface BookDao {

    void save(Book book);

    List<Book> getAll();

    Book findById(Integer id);

    void delete (int id);

    Book update(Book book);

    void changeStatusBook(Book book, BookStatus bookStatus);
}
