package dao.impl;

import dao.BookDao;
import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    private List<Book> books = new ArrayList<>();
    private Integer id = 0;
    public BookDaoImpl() { init();
    }

    private void init() {
        Book book = new Book(idGenerator(), "Java Для всех A.B.", 15.00);
        Book book1 = new Book(idGenerator(), "Java Полное руководство G.B.", 30.11);
        Book book2 = new Book(idGenerator(), "Изучаем Java S.K.", 20.02);
        Book book3 = new Book(idGenerator(), "Pro Git S.C.", 8.03);
        Book book4 = new Book(idGenerator(), "Java Эффектное программирование D.B.", 22.04);
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
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
}
