package dao.impl;

import dao.OrderDao;
import model.Book;
import model.BookStatus;
import model.Order;
import model.OrderStatus;
import sun.swing.BakedArrayList;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static model.OrderStatus.*;

public class OrderDaoImpl implements OrderDao {
    private List<Book> books = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();
    private Integer id = 0;

    public OrderDaoImpl() {
    }

    private int idGenerator() {
        id = id + 1;
        return id;
    }

    @Override
    public Order save(Order order) {
        order.setId(idGenerator());
        orders.add(order);
        return order;
    }

    @Override
    public List<Order> getAll() {
        return orders;
    }

    @Override
    public boolean delete(int id) {
        for (Order order: orders) {
            if(order.getId() == id){
                orders.remove(order);
                return true;
            }
        }
        return false;
    }

    @Override
    public Order update(Order entiity) {
        Order order = orders.get(idGenerator());
        return order;
    }

    @Override
    public Order findById(int id) {
        for (Order order: orders) {
            if(order.getId() == id){
                int index = orders.lastIndexOf(order);
                return orders.get(index);
            }
        }
        return null;
    }

    @Override
    public void changeOrderStatus(int id) {
    }

    public void changeStatusOrder(Order order, OrderStatus orderStatus) {
        order.setOrderStatus(orderStatus);
        save(order);
    }

}
