package model;

import java.util.List;

public class Order {
    private int id;
    private OrderStatus orderStatus;
    private List<Book> books;

    public Order(int id, OrderStatus orderStatus, List<Book> books) {
        this.id = id;
        this.orderStatus = orderStatus;
        this.books = books;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderStatus=" + orderStatus +
                ", books=" + books +
                '}';
    }
}