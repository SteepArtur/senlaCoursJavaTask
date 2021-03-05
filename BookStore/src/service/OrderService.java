package service;

import model.Order;
import model.OrderStatus;

import java.util.List;

public interface OrderService {

    Order save(Order entity);

    List<Order> findAll();

    boolean delete(int id);

    Order findById(int i);

    void changeStatusOrderById(Integer orderId, OrderStatus orderStatuss);

    void changeStatusOrder(Order order, OrderStatus orderStatus);
}