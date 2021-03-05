package service.impl;

import dao.BookDao;
import dao.impl.BookDaoImpl;
import model.Book;
import service.BookService;
import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookDao bookDao = new BookDaoImpl();

    public BookServiceImpl() {
    }

    public List<Book> findAll() {
        List<Book> books = bookDao.getAll();
        return books;
    }

    @Override
    public Book addBook(String name, double price) {
        Book book = new Book(name, price);
        bookDao.save(book);
        return book;
    }
}

