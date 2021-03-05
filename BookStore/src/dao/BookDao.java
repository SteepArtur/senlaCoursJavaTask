package dao;

import model.Book;
import java.util.List;

public interface BookDao {

    void save(Book book);

    List<Book> getAll();

    Book findById(Integer id);

    void delete (int id);

    Book update(Book book);
}
