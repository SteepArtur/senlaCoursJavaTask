package service.impl;

import dao.BookDao;
import dao.impl.BookDaoImpl;
import model.Book;
import service.BookService;
import util.comparators.BookComparatorIn;
import util.comparators.BookComparatorName;
import util.comparators.BookComparatorDateSet;
import util.comparators.BookComparatorPrice;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookDao bookDao = new BookDaoImpl();

    public BookServiceImpl() {
    }

    public List<Book> findAll() {
        return bookDao.getAll();
    }

    @Override
    public Book addBook(String name, double price) {
        Book book = new Book(name, price);
        bookDao.save(book);
        return book;
    }

    @Override
    public List<Book> sortBookByName(List<Book> books) {
        books.sort(new BookComparatorName());
        return new ArrayList<>(books);
    }

    @Override
    public List<Book> sortBookByDate(List<Book> books) {
        books.sort(new BookComparatorDateSet());
        return new ArrayList<>(books);
    }

    @Override
    public List<Book> sortBookByPrice(List<Book> books) {
        books.sort(new BookComparatorPrice());
        return new ArrayList<>(books);
    }

    @Override
    public List<Book> sortInBook(List<Book> books) {
        books.sort(new BookComparatorIn());
        return new ArrayList<>(books);
    }
}