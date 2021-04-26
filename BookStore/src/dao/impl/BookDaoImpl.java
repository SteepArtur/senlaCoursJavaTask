package dao.impl;

import dao.BookDao;
import model.Book;
import model.BookStatus;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    private List<Book> books = new ArrayList<>();
    private Integer id = 0;

    public BookDaoImpl() { init();
    }

    private void init() {
        Book book = new Book(idGenerator(), "Java Для всех A.B.", 15.00,2005,BookStatus.IN_STOCK);
        Book book1 = new Book(idGenerator(), "Полное руководство G.B.", 30.11,2008,BookStatus.ON_STOCK);
        Book book2 = new Book(idGenerator(), "Изучаем Java S.K.", 20.02,2013,BookStatus.ON_STOCK);
        Book book3 = new Book(idGenerator(), "Pro Git S.C.", 8.03,2011,BookStatus.ON_STOCK);
        Book book4 = new Book(idGenerator(), "Эффектное программирование D.B.", 22.04,2010,BookStatus.ABSENCE);
        Book book5 = new Book(idGenerator(), "Алгоритмы", 22.04,2015,BookStatus.ABSENCE);
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
    }

    private int idGenerator() {
        id = id + 1;
        return id;
    }

    @Override
    public void save(Book entity) {
        entity.setId(idGenerator());
        books.add(entity);
    }

    @Override
    public List<Book> getAll() {
        return new ArrayList<>(books);
    }

    @Override
    public Book findById(Integer id) {
        return books.get(id);
    }

    @Override
    public void delete(int id) {
        books.remove(id);
    }

    @Override
    public Book update(Book entiity) {
        Book book = books.get(idGenerator());
        book.setName(entiity.getName());
        book.setPrice(entiity.getPrice());
        return book;
    }
    public void changeStatusBook(Book book, BookStatus bookStatus) {
        book.setBookStatus(bookStatus);
        save(book);
    }
}
