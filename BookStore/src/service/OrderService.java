package service;

import model.Book;
import model.Order;
import model.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderService {

    Order saveOrderAndCreateRequest(Order entity);

    List<Order> findAll();

    boolean delete(int id);

    Order findById(int i);

    List<Order> sortOrderDate(List<Order> orders);

    void changeStatusOrderById(Integer orderId, OrderStatus orderStatus);

    void changeStatusOrder(Order order, OrderStatus orderStatus);

    List<Order> sortOrderByPrice(List<Order> orders);

    List<Order> sortOrderByStatus(List<Order> orders);
}