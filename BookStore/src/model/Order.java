package model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int id;
    private OrderStatus orderStatus;
    private List<Book> books;
    private double totalCost;//totalCost
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Order() {
    }

    public Order(int id, OrderStatus orderStatus, List<Book> books, double totalCost, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = id;
        this.orderStatus = orderStatus;
        this.books = books;
        this.totalCost = totalCost;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
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
                ", totalCost=" + totalCost +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}