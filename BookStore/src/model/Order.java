package model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private OrderStatus orderStatus;
    private List<Book> books;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Order() {
    }

    public Order(int id, OrderStatus orderStatus, List<Book> books, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = id;
        this.orderStatus = orderStatus;
        this.books = books;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderStatus getOrderStatus(OrderStatus aNew) {
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


    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderStatus=" + orderStatus +
                ", books=" + books +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}