package service;

import model.Book;
import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book addBook(String name, double price);
}
