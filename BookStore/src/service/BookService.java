package service;

import model.Book;
import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book addBook(String name, double price);

    List<Book> sortBookByName(List<Book> books);

    List<Book> sortBookByDate(List<Book> books);

    List<Book> sortBookByPrice(List<Book> books);

    List<Book> sortInBook(List<Book> books);
}
